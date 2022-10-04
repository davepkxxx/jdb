package org.daida.jdb.sql.parse;

import org.daida.jdb.lang.NullUtils;
import org.daida.jdb.sql.ast.AllColumns;
import org.daida.jdb.sql.ast.Identifier;
import org.daida.jdb.sql.ast.Program;
import org.daida.jdb.sql.ast.SyntaxNode;
import org.daida.jdb.sql.ast.clause.*;
import org.daida.jdb.sql.ast.expr.*;
import org.daida.jdb.sql.ast.frag.FromItem;
import org.daida.jdb.sql.ast.frag.Items;
import org.daida.jdb.sql.ast.frag.SelectItem;
import org.daida.jdb.sql.ast.literal.*;
import org.daida.jdb.sql.ast.stmt.*;
import org.daida.jdb.sql.parse.antlr.SqlLexer;
import org.daida.jdb.sql.parse.antlr.SqlParser;
import org.daida.jdb.sql.parse.antlr.SqlParserBaseVisitor;

public class SyntaxNodeParserVisitor extends SqlParserBaseVisitor<SyntaxNode> {
    @Override
    public Program visitProg(SqlParser.ProgContext ctx) {
        return new Program(
                ctx.stmt().stream().map(this::visitStmt).toList()
        );
    }

    @Override
    public Statement visitStmt(SqlParser.StmtContext ctx) {
        if (ctx.createTableStmt() != null) {
            return this.visitCreateTableStmt(ctx.createTableStmt());
        } else if (ctx.deleteStmt() != null) {
            return this.visitDeleteStmt(ctx.deleteStmt());
        } else if (ctx.insertStmt() != null) {
            return this.visitInsertStmt(ctx.insertStmt());
        } else if (ctx.selectStmt() != null) {
            return this.visitSelectStmt(ctx.selectStmt());
        } else if (ctx.truncateStmt() != null) {
            return this.visitTruncateStmt(ctx.truncateStmt());
        } else if (ctx.updateStmt() != null) {
            return this.visitUpdateStmt(ctx.updateStmt());
        } else {
            return null;
        }
    }

    @Override
    public CreateTableStatement visitCreateTableStmt(SqlParser.CreateTableStmtContext ctx) {
        return new CreateTableStatement(
                this.visitIdExpr(ctx.idExpr()),
                ctx.columnClause().stream().map(this::visitColumnClause).toList(),
                NullUtils.optionalChaining(ctx.cstrPkClause(), this::visitCstrPkClause),
                ctx.cstrFkClause().stream().map(this::visitCstrFkClause).toList()
        );
    }

    @Override
    public DeleteStatement visitDeleteStmt(SqlParser.DeleteStmtContext ctx) {
        return new DeleteStatement(
                this.visitFromClause(ctx.fromClause()),
                NullUtils.optionalChaining(ctx.whereClause(), this::visitWhereClause)
        );
    }

    @Override
    public InsertStatement visitInsertStmt(SqlParser.InsertStmtContext ctx) {
        return new InsertStatement(
                this.visitIdExpr(ctx.idExpr()),
                ctx.columnItem().stream().map(this::visitColumnItem).toList(),
                ctx.valueLiteral().stream().map(this::visitValueLiteral).toList()
        );
    }

    @Override
    public SelectStatement visitSelectStmt(SqlParser.SelectStmtContext ctx) {
        return new SelectStatement(
                this.visitSelectClause(ctx.selectClause()),
                this.visitFromClause(ctx.fromClause()),
                NullUtils.optionalChaining(ctx.whereClause(), this::visitWhereClause)
        );
    }

    @Override
    public TruncateStmt visitTruncateStmt(SqlParser.TruncateStmtContext ctx) {
        return new TruncateStmt(this.visitIdExpr(ctx.idExpr()));
    }

    @Override
    public UpdateStatement visitUpdateStmt(SqlParser.UpdateStmtContext ctx) {
        return new UpdateStatement(
                this.visitIdExpr(ctx.idExpr()),
                ctx.setExpr().stream().map(this::visitSetExpr).toList(),
                this.visitWhereClause(ctx.whereClause())
        );
    }

    @Override
    public ColumnClause visitColumnClause(SqlParser.ColumnClauseContext ctx) {
        return new ColumnClause(
                this.visitColumnItem(ctx.columnItem()),
                this.visitIdExpr(ctx.idExpr()),
                this.visitDigits(ctx.digits()),
                ctx.NOT() != null
        );
    }

    @Override
    public Identifier visitCstrClause(SqlParser.CstrClauseContext ctx) {
        return this.visitIdExpr(ctx.idExpr());
    }

    @Override
    public ForeignKeyClause visitCstrFkClause(SqlParser.CstrFkClauseContext ctx) {
        return new ForeignKeyClause(
                NullUtils.optionalChaining(ctx.cstrClause(), this::visitCstrClause),
                this.visitFkClause(ctx.fkClause()),
                this.visitReferencesClause(ctx.referencesClause())
        );
    }

    @Override
    public PrimaryKeyClause visitCstrPkClause(SqlParser.CstrPkClauseContext ctx) {
        return new PrimaryKeyClause(
                NullUtils.optionalChaining(ctx.cstrClause(), this::visitCstrClause),
                this.visitPkClause(ctx.pkClause())
        );
    }

    @Override
    public Items<Identifier> visitFkClause(SqlParser.FkClauseContext ctx) {
        return new Items<>(ctx.idExpr().stream().map(this::visitIdExpr).toList());
    }

    @Override
    public FromClause visitFromClause(SqlParser.FromClauseContext ctx) {
        return new FromClause(
                ctx.joinClause() == null ? this.visitFromItem(ctx.fromItem()) : this.visitJoinClause(ctx.joinClause()),
                NullUtils.optionalChaining(ctx.whereItem(), this::visitWhereItem)
        );
    }

    @Override
    public Join visitJoinClause(SqlParser.JoinClauseContext ctx) {
        return new Join(
                ctx.joinClause() == null ? this.visitFromItem(ctx.fromItem(0)) : this.visitJoinClause(ctx.joinClause()),
                this.visitFromItem(ctx.fromItem(ctx.joinClause() == null ? 1 : 0)),
                ctx.operator.getType() == SqlLexer.COMMA ? SqlLexer.INNER : ctx.operator.getType()
        );
    }

    @Override
    public Items<Identifier> visitPkClause(SqlParser.PkClauseContext ctx) {
        return new Items<>(ctx.columnItem().stream().map(this::visitColumnItem).toList());
    }

    @Override
    public ReferencesClause visitReferencesClause(SqlParser.ReferencesClauseContext ctx) {
        return new ReferencesClause(
                this.visitIdExpr(ctx.idExpr()),
                ctx.columnItem().stream().map(this::visitColumnItem).toList()
        );
    }

    @Override
    public SelectClause visitSelectClause(SqlParser.SelectClauseContext ctx) {
        return new SelectClause(
                ctx.selectItem().stream().map(this::visitSelectItem).toList(),
                ctx.DISTINCT() != null
        );
    }

    @Override
    public Expression visitWhereClause(SqlParser.WhereClauseContext ctx) {
        return this.visitWhereItem(ctx.whereItem());
    }

    @Override
    public Identifier visitColumnItem(SqlParser.ColumnItemContext ctx) {
        return this.visitIdExpr(ctx.idExpr());
    }

    @Override
    public Alias<FromItem> visitFromItem(SqlParser.FromItemContext ctx) {
        return new Alias<>(
                this.visitIdExpr(ctx.idExpr(0)),
                NullUtils.optionalChaining(ctx.idExpr(1), this::visitIdExpr)
        );
    }

    @Override
    public Alias<SelectItem> visitSelectItem(SqlParser.SelectItemContext ctx) {
        return new Alias<>(
                ctx.STAR() == null ? this.visitExpr(ctx.expr()) : new AllColumns(),
                NullUtils.optionalChaining(ctx.idExpr(), this::visitIdExpr)
        );
    }

    @Override
    public Expression visitWhereItem(SqlParser.WhereItemContext ctx) {
        return this.visitExpr(ctx.expr());
    }

    @Override
    public Expression visitExpr(SqlParser.ExprContext ctx) {
        var type = ctx.operator.getType();
        switch (ctx.expr().size()) {
            case 0: // no expr
                if (ctx.idExpr() != null) {
                    this.visitIdExpr(ctx.idExpr());
                } else if (ctx.idChainExpr() != null) {
                    this.visitIdChainExpr(ctx.idChainExpr());
                } else if (ctx.valueLiteral() != null) {
                    this.visitValueLiteral(ctx.valueLiteral());
                } else {
                    return null;
                }
            case 1: // unary expr
                var value = this.visitExpr(ctx.expr(0));
                return switch (type) {
                    // comparison
                    case SqlLexer.IS -> ctx.NOT() == null ? new IsNull(value) : new IsNotNull(value);
                    // logical
                    case SqlLexer.NOT -> new Not(value);
                    // operation
                    case SqlLexer.MINUS -> new Negative(value);
                    // paren
                    default -> value;
                };
            case 2: // binary expr
                var left = this.visitExpr(ctx.expr(0));
                var right = this.visitExpr(ctx.expr(1));
                return switch (type) {
                    // comparison
                    case SqlLexer.EQ, SqlLexer.GREATER_THAN, SqlLexer.GREATER_THAN_OR_EQ, SqlLexer.LESS_THAN, SqlLexer.LESS_THAN_OR_EQ, SqlLexer.LIKE, SqlLexer.NOT_EQ ->
                            new Comparison(left, right, type);
                    // logical
                    case SqlLexer.AND -> new And(left, right);
                    case SqlLexer.OR -> new Or(left, right);
                    // operation
                    case SqlLexer.MINUS, SqlLexer.PERCENT, SqlLexer.PLUS, SqlLexer.SLASH, SqlLexer.STAR ->
                            new Operation(left, right, type);
                    default -> null;
                };
            case 3: // ternary expr
                return new Between(
                        this.visitExpr(ctx.expr(0)),
                        new And(this.visitExpr(ctx.expr(1)), this.visitExpr(ctx.expr(2)))
                );
            default:
                return null;
        }
    }

    @Override
    public Identifier visitIdExpr(SqlParser.IdExprContext ctx) {
        return new Identifier(ctx.getText());
    }

    @Override
    public ChainExpr visitIdChainExpr(SqlParser.IdChainExprContext ctx) {
        return new ChainExpr(this.visitIdExpr(ctx.idExpr(0)), this.visitIdExpr(ctx.idExpr(1)));
    }

    @Override
    public SetExpr visitSetExpr(SqlParser.SetExprContext ctx) {
        return new SetExpr(
                this.visitColumnItem(ctx.columnItem()),
                this.visitExpr(ctx.expr())
        );
    }

    @Override
    public ValueLiteral visitValueLiteral(SqlParser.ValueLiteralContext ctx) {
        if (ctx.DigitsLiteral() != null) return new Digits(ctx.getText());
        if (ctx.NumericLiteral() != null) return new Numeric(ctx.getText());
        if (ctx.StringLiteral() != null) return new CharString(ctx.getText());
        if (ctx.FALSE() != null) return new False();
        if (ctx.TRUE() != null) return new True();
        return null;
    }

    @Override
    public Digits visitDigits(SqlParser.DigitsContext ctx) {
        return new Digits(ctx.getText());
    }
}
