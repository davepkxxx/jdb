// Generated from E:/workspace/jdb/sql/src/main/resources\SqlParser.g4 by ANTLR 4.10.1
package org.daida.jdb.sql.parse.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SqlParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SqlParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#createTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStmt(SqlParser.CreateTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStmt(SqlParser.DeleteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStmt(SqlParser.InsertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(SqlParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#truncateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateStmt(SqlParser.TruncateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#updateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStmt(SqlParser.UpdateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnClause(SqlParser.ColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cstrClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCstrClause(SqlParser.CstrClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cstrFkClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCstrFkClause(SqlParser.CstrFkClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cstrPkClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCstrPkClause(SqlParser.CstrPkClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fkClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFkClause(SqlParser.FkClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(SqlParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pkClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkClause(SqlParser.PkClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#referencesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencesClause(SqlParser.ReferencesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SqlParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#columnItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnItem(SqlParser.ColumnItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fromItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromItem(SqlParser.FromItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectItem(SqlParser.SelectItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whereItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereItem(SqlParser.WhereItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#idExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(SqlParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#idChainExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdChainExpr(SqlParser.IdChainExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#setExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpr(SqlParser.SetExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#valueLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueLiteral(SqlParser.ValueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits(SqlParser.DigitsContext ctx);
}