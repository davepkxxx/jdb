// Generated from E:/workspace/jdb/sql/src/main/resources\SqlParser.g4 by ANTLR 4.10.1
package org.daida.jdb.sql.parse.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SqlParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SqlParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SqlParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SqlParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStmt(SqlParser.CreateTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStmt(SqlParser.CreateTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStmt(SqlParser.DeleteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStmt(SqlParser.DeleteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void enterInsertStmt(SqlParser.InsertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void exitInsertStmt(SqlParser.InsertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(SqlParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(SqlParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#truncateStmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncateStmt(SqlParser.TruncateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#truncateStmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncateStmt(SqlParser.TruncateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStmt(SqlParser.UpdateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStmt(SqlParser.UpdateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columnClause}.
	 * @param ctx the parse tree
	 */
	void enterColumnClause(SqlParser.ColumnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columnClause}.
	 * @param ctx the parse tree
	 */
	void exitColumnClause(SqlParser.ColumnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cstrClause}.
	 * @param ctx the parse tree
	 */
	void enterCstrClause(SqlParser.CstrClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cstrClause}.
	 * @param ctx the parse tree
	 */
	void exitCstrClause(SqlParser.CstrClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cstrFkClause}.
	 * @param ctx the parse tree
	 */
	void enterCstrFkClause(SqlParser.CstrFkClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cstrFkClause}.
	 * @param ctx the parse tree
	 */
	void exitCstrFkClause(SqlParser.CstrFkClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cstrPkClause}.
	 * @param ctx the parse tree
	 */
	void enterCstrPkClause(SqlParser.CstrPkClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cstrPkClause}.
	 * @param ctx the parse tree
	 */
	void exitCstrPkClause(SqlParser.CstrPkClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fkClause}.
	 * @param ctx the parse tree
	 */
	void enterFkClause(SqlParser.FkClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fkClause}.
	 * @param ctx the parse tree
	 */
	void exitFkClause(SqlParser.FkClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(SqlParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(SqlParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#pkClause}.
	 * @param ctx the parse tree
	 */
	void enterPkClause(SqlParser.PkClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pkClause}.
	 * @param ctx the parse tree
	 */
	void exitPkClause(SqlParser.PkClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#referencesClause}.
	 * @param ctx the parse tree
	 */
	void enterReferencesClause(SqlParser.ReferencesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#referencesClause}.
	 * @param ctx the parse tree
	 */
	void exitReferencesClause(SqlParser.ReferencesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SqlParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SqlParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columnItem}.
	 * @param ctx the parse tree
	 */
	void enterColumnItem(SqlParser.ColumnItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columnItem}.
	 * @param ctx the parse tree
	 */
	void exitColumnItem(SqlParser.ColumnItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fromItem}.
	 * @param ctx the parse tree
	 */
	void enterFromItem(SqlParser.FromItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fromItem}.
	 * @param ctx the parse tree
	 */
	void exitFromItem(SqlParser.FromItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectItem(SqlParser.SelectItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectItem(SqlParser.SelectItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereItem}.
	 * @param ctx the parse tree
	 */
	void enterWhereItem(SqlParser.WhereItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereItem}.
	 * @param ctx the parse tree
	 */
	void exitWhereItem(SqlParser.WhereItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(SqlParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(SqlParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#idChainExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdChainExpr(SqlParser.IdChainExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#idChainExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdChainExpr(SqlParser.IdChainExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetExpr(SqlParser.SetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetExpr(SqlParser.SetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#valueLiteral}.
	 * @param ctx the parse tree
	 */
	void enterValueLiteral(SqlParser.ValueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#valueLiteral}.
	 * @param ctx the parse tree
	 */
	void exitValueLiteral(SqlParser.ValueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(SqlParser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(SqlParser.DigitsContext ctx);
}