// Generated from E:/workspace/jdb/sql/src/main/resources\SqlParser.g4 by ANTLR 4.10.1
package org.daida.jdb.sql.parse.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, COMMA=2, DOT=3, EQ=4, GREATER_THAN=5, GREATER_THAN_OR_EQ=6, LESS_THAN=7, 
		LESS_THAN_OR_EQ=8, MINUS=9, NOT_EQ=10, PAREN_OPEN=11, PAREN_CLOSE=12, 
		PERCENT=13, PLUS=14, SEMI=15, SLASH=16, STAR=17, ADD=18, ALERT=19, ALL=20, 
		AND=21, AS=22, ASC=23, BEGIN=24, BETWEEN=25, BY=26, CASE=27, CAST=28, 
		CHECK=29, CLOSE=30, COLUMN=31, COMMIT=32, CONSTRAINT=33, CREATE=34, CROSS=35, 
		CURSOR=36, DATABASE=37, DESC=38, DECLARE=39, DEFAULT=40, DELETE=41, DISTINCT=42, 
		DROP=43, ELSE=44, END=45, EXCEPT=46, EXEC=47, EXECUTE=48, EXIST=49, FALSE=50, 
		FETCH=51, FIRST=52, FOR=53, FOREIGN=54, FROM=55, FULL=56, FUNCTION=57, 
		GRANT=58, GROUP=59, HAVING=60, KEY=61, IF=62, IN=63, INDEX=64, INNER=65, 
		INSERT=66, INSTEAD=67, INTERSECT=68, INOUT=69, INTO=70, IS=71, JOIN=72, 
		LEFT=73, LIKE=74, LOCK=75, LOOP=76, MATCHED=77, MERGE=78, NATURAL=79, 
		NEXT=80, NOT=81, NULL=82, OF=83, OFFSET=84, ON=85, ONLY=86, OR=87, ORDER=88, 
		OUT=89, OUTER=90, PRIMARY=91, PROCEDURE=92, REFERENCES=93, RENAME=94, 
		RETURN=95, REVOKE=96, RIGHT=97, ROLE=98, ROLLBACK=99, ROW=100, ROWS=101, 
		SAVE=102, SCHEMA=103, SELECT=104, SET=105, TABLE=106, THEN=107, TO=108, 
		TRANSACTION=109, TRIGGER=110, TRUE=111, TRUNCATE=112, UNION=113, UNIQUE=114, 
		UPDATE=115, USE=116, USER=117, USING=118, VALUES=119, VIEW=120, WHEN=121, 
		WHERE=122, WHILE=123, WITH=124, BlockComment=125, LineComment=126, Newline=127, 
		Whitespace=128, DigitsLiteral=129, NumericLiteral=130, IdentiferLiteral=131, 
		StringLiteral=132;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_createTableStmt = 2, RULE_deleteStmt = 3, 
		RULE_insertStmt = 4, RULE_selectStmt = 5, RULE_truncateStmt = 6, RULE_updateStmt = 7, 
		RULE_columnClause = 8, RULE_cstrClause = 9, RULE_cstrFkClause = 10, RULE_cstrPkClause = 11, 
		RULE_fkClause = 12, RULE_fromClause = 13, RULE_joinClause = 14, RULE_pkClause = 15, 
		RULE_referencesClause = 16, RULE_selectClause = 17, RULE_whereClause = 18, 
		RULE_columnItem = 19, RULE_fromItem = 20, RULE_selectItem = 21, RULE_whereItem = 22, 
		RULE_expr = 23, RULE_idExpr = 24, RULE_idChainExpr = 25, RULE_setExpr = 26, 
		RULE_valueLiteral = 27, RULE_digits = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmt", "createTableStmt", "deleteStmt", "insertStmt", "selectStmt", 
			"truncateStmt", "updateStmt", "columnClause", "cstrClause", "cstrFkClause", 
			"cstrPkClause", "fkClause", "fromClause", "joinClause", "pkClause", "referencesClause", 
			"selectClause", "whereClause", "columnItem", "fromItem", "selectItem", 
			"whereItem", "expr", "idExpr", "idChainExpr", "setExpr", "valueLiteral", 
			"digits"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'.'", "'='", "'>'", "'>='", "'<'", "'<='", "'-'", 
			"'<>'", "'('", "')'", "'%'", "'+'", "';'", "'/'", "'*'", "'ADD'", "'ALERT'", 
			"'ALL'", "'AND'", "'AS'", "'ASC'", "'BEGIN'", "'BETWEEN'", "'BY'", "'CASE'", 
			"'CAST'", "'CHECK'", "'CLOSE'", "'COLUMN'", "'COMMIT'", "'CONSTRAINT'", 
			"'CREATE'", "'CROSS'", "'CURSOR'", "'DATABASE'", "'DESC'", "'DECLARE'", 
			"'DEFAULT'", "'DELETE'", "'DISTINCT'", "'DROP'", "'ELSE'", "'END'", "'EXCEPT'", 
			"'EXEC'", "'EXECUTE'", "'EXIST'", "'FALSE'", "'FETCH'", "'FIRST'", "'FOR'", 
			"'FOREIGN'", "'FROM'", "'FULL'", "'FUNCTION'", "'GRANT'", "'GROUP'", 
			"'HAVING'", "'KEY'", "'IF'", "'IN'", "'INDEX'", "'INNER'", "'INSERT'", 
			"'INSTEAD'", "'INTERSECT'", "'INOUT'", "'INTO'", "'IS'", "'JOIN'", "'LEFT'", 
			"'LIKE'", "'LOCK'", "'LOOP'", "'MATCHED'", "'MERGE'", "'NATURAL'", "'NEXT'", 
			"'NOT'", "'NULL'", "'OF'", "'OFFSET'", "'ON'", "'ONLY'", "'OR'", "'ORDER'", 
			"'OUT'", "'OUTER'", "'PRIMARY'", "'PROCEDURE'", "'REFERENCES'", "'RENAME'", 
			"'RETURN'", "'REVOKE'", "'RIGHT'", "'ROLE'", "'ROLLBACK'", "'ROW'", "'ROWS'", 
			"'SAVE'", "'SCHEMA'", "'SELECT'", "'SET'", "'TABLE'", "'THEN'", "'TO'", 
			"'TRANSACTION'", "'TRIGGER'", "'TRUE'", "'TRUNCATE'", "'UNION'", "'UNIQUE'", 
			"'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", "'VIEW'", "'WHEN'", 
			"'WHERE'", "'WHILE'", "'WITH'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "COMMA", "DOT", "EQ", "GREATER_THAN", "GREATER_THAN_OR_EQ", 
			"LESS_THAN", "LESS_THAN_OR_EQ", "MINUS", "NOT_EQ", "PAREN_OPEN", "PAREN_CLOSE", 
			"PERCENT", "PLUS", "SEMI", "SLASH", "STAR", "ADD", "ALERT", "ALL", "AND", 
			"AS", "ASC", "BEGIN", "BETWEEN", "BY", "CASE", "CAST", "CHECK", "CLOSE", 
			"COLUMN", "COMMIT", "CONSTRAINT", "CREATE", "CROSS", "CURSOR", "DATABASE", 
			"DESC", "DECLARE", "DEFAULT", "DELETE", "DISTINCT", "DROP", "ELSE", "END", 
			"EXCEPT", "EXEC", "EXECUTE", "EXIST", "FALSE", "FETCH", "FIRST", "FOR", 
			"FOREIGN", "FROM", "FULL", "FUNCTION", "GRANT", "GROUP", "HAVING", "KEY", 
			"IF", "IN", "INDEX", "INNER", "INSERT", "INSTEAD", "INTERSECT", "INOUT", 
			"INTO", "IS", "JOIN", "LEFT", "LIKE", "LOCK", "LOOP", "MATCHED", "MERGE", 
			"NATURAL", "NEXT", "NOT", "NULL", "OF", "OFFSET", "ON", "ONLY", "OR", 
			"ORDER", "OUT", "OUTER", "PRIMARY", "PROCEDURE", "REFERENCES", "RENAME", 
			"RETURN", "REVOKE", "RIGHT", "ROLE", "ROLLBACK", "ROW", "ROWS", "SAVE", 
			"SCHEMA", "SELECT", "SET", "TABLE", "THEN", "TO", "TRANSACTION", "TRIGGER", 
			"TRUE", "TRUNCATE", "UNION", "UNIQUE", "UPDATE", "USE", "USER", "USING", 
			"VALUES", "VIEW", "WHEN", "WHERE", "WHILE", "WITH", "BlockComment", "LineComment", 
			"Newline", "Whitespace", "DigitsLiteral", "NumericLiteral", "IdentiferLiteral", 
			"StringLiteral"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SqlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SqlParser.SEMI, i);
		}
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				stmt();
				setState(59);
				match(SEMI);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CREATE || _la==DELETE || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INSERT - 66)) | (1L << (SELECT - 66)) | (1L << (TRUNCATE - 66)) | (1L << (UPDATE - 66)))) != 0)) {
					{
					{
					setState(60);
					stmt();
					setState(61);
					match(SEMI);
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(68);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				stmt();
				setState(71);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public CreateTableStmtContext createTableStmt() {
			return getRuleContext(CreateTableStmtContext.class,0);
		}
		public DeleteStmtContext deleteStmt() {
			return getRuleContext(DeleteStmtContext.class,0);
		}
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TruncateStmtContext truncateStmt() {
			return getRuleContext(TruncateStmtContext.class,0);
		}
		public UpdateStmtContext updateStmt() {
			return getRuleContext(UpdateStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				createTableStmt();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				deleteStmt();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				insertStmt();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				selectStmt();
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				truncateStmt();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				updateStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableStmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlParser.CREATE, 0); }
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(SqlParser.PAREN_OPEN, 0); }
		public List<ColumnClauseContext> columnClause() {
			return getRuleContexts(ColumnClauseContext.class);
		}
		public ColumnClauseContext columnClause(int i) {
			return getRuleContext(ColumnClauseContext.class,i);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(SqlParser.PAREN_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public CstrPkClauseContext cstrPkClause() {
			return getRuleContext(CstrPkClauseContext.class,0);
		}
		public List<CstrFkClauseContext> cstrFkClause() {
			return getRuleContexts(CstrFkClauseContext.class);
		}
		public CstrFkClauseContext cstrFkClause(int i) {
			return getRuleContext(CstrFkClauseContext.class,i);
		}
		public CreateTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterCreateTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitCreateTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableStmtContext createTableStmt() throws RecognitionException {
		CreateTableStmtContext _localctx = new CreateTableStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createTableStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(CREATE);
			setState(84);
			idExpr();
			setState(85);
			match(PAREN_OPEN);
			setState(86);
			columnClause();
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					match(COMMA);
					setState(88);
					columnClause();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(94);
				match(COMMA);
				setState(95);
				cstrPkClause();
				}
				break;
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				cstrFkClause();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(PAREN_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteStmtContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlParser.DELETE, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterDeleteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitDeleteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitDeleteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStmtContext deleteStmt() throws RecognitionException {
		DeleteStmtContext _localctx = new DeleteStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_deleteStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(DELETE);
			setState(108);
			fromClause();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(109);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlParser.INTO, 0); }
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public List<TerminalNode> PAREN_OPEN() { return getTokens(SqlParser.PAREN_OPEN); }
		public TerminalNode PAREN_OPEN(int i) {
			return getToken(SqlParser.PAREN_OPEN, i);
		}
		public List<ColumnItemContext> columnItem() {
			return getRuleContexts(ColumnItemContext.class);
		}
		public ColumnItemContext columnItem(int i) {
			return getRuleContext(ColumnItemContext.class,i);
		}
		public List<TerminalNode> PAREN_CLOSE() { return getTokens(SqlParser.PAREN_CLOSE); }
		public TerminalNode PAREN_CLOSE(int i) {
			return getToken(SqlParser.PAREN_CLOSE, i);
		}
		public TerminalNode VALUES() { return getToken(SqlParser.VALUES, 0); }
		public List<ValueLiteralContext> valueLiteral() {
			return getRuleContexts(ValueLiteralContext.class);
		}
		public ValueLiteralContext valueLiteral(int i) {
			return getRuleContext(ValueLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterInsertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitInsertStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitInsertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(INSERT);
			setState(113);
			match(INTO);
			setState(114);
			idExpr();
			setState(115);
			match(PAREN_OPEN);
			setState(116);
			columnItem();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(117);
				match(COMMA);
				setState(118);
				columnItem();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(PAREN_CLOSE);
			setState(125);
			match(VALUES);
			setState(126);
			match(PAREN_OPEN);
			setState(127);
			valueLiteral();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(128);
				match(COMMA);
				setState(129);
				valueLiteral();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(PAREN_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStmtContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			selectClause();
			setState(138);
			fromClause();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(139);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateStmtContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(SqlParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlParser.TABLE, 0); }
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public TruncateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTruncateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTruncateStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTruncateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateStmtContext truncateStmt() throws RecognitionException {
		TruncateStmtContext _localctx = new TruncateStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_truncateStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(TRUNCATE);
			setState(143);
			match(TABLE);
			setState(144);
			idExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateStmtContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SqlParser.UPDATE, 0); }
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlParser.SET, 0); }
		public List<SetExprContext> setExpr() {
			return getRuleContexts(SetExprContext.class);
		}
		public SetExprContext setExpr(int i) {
			return getRuleContext(SetExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterUpdateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitUpdateStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitUpdateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStmtContext updateStmt() throws RecognitionException {
		UpdateStmtContext _localctx = new UpdateStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_updateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(UPDATE);
			setState(147);
			idExpr();
			setState(148);
			match(SET);
			setState(149);
			setExpr();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(150);
				match(COMMA);
				setState(151);
				setExpr();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(157);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnClauseContext extends ParserRuleContext {
		public ColumnItemContext columnItem() {
			return getRuleContext(ColumnItemContext.class,0);
		}
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(SqlParser.PAREN_OPEN, 0); }
		public DigitsContext digits() {
			return getRuleContext(DigitsContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(SqlParser.PAREN_CLOSE, 0); }
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlParser.NULL, 0); }
		public ColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterColumnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitColumnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnClauseContext columnClause() throws RecognitionException {
		ColumnClauseContext _localctx = new ColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			columnItem();
			setState(161);
			idExpr();
			{
			setState(162);
			match(PAREN_OPEN);
			setState(163);
			digits();
			setState(164);
			match(PAREN_CLOSE);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(166);
				match(NOT);
				setState(167);
				match(NULL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CstrClauseContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(SqlParser.CONSTRAINT, 0); }
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public CstrClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cstrClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterCstrClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitCstrClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitCstrClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CstrClauseContext cstrClause() throws RecognitionException {
		CstrClauseContext _localctx = new CstrClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cstrClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(CONSTRAINT);
			setState(171);
			idExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CstrFkClauseContext extends ParserRuleContext {
		public FkClauseContext fkClause() {
			return getRuleContext(FkClauseContext.class,0);
		}
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public CstrClauseContext cstrClause() {
			return getRuleContext(CstrClauseContext.class,0);
		}
		public CstrFkClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cstrFkClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterCstrFkClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitCstrFkClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitCstrFkClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CstrFkClauseContext cstrFkClause() throws RecognitionException {
		CstrFkClauseContext _localctx = new CstrFkClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cstrFkClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(173);
				cstrClause();
				}
			}

			setState(176);
			fkClause();
			setState(177);
			referencesClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CstrPkClauseContext extends ParserRuleContext {
		public PkClauseContext pkClause() {
			return getRuleContext(PkClauseContext.class,0);
		}
		public CstrClauseContext cstrClause() {
			return getRuleContext(CstrClauseContext.class,0);
		}
		public CstrPkClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cstrPkClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterCstrPkClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitCstrPkClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitCstrPkClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CstrPkClauseContext cstrPkClause() throws RecognitionException {
		CstrPkClauseContext _localctx = new CstrPkClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cstrPkClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(179);
				cstrClause();
				}
			}

			setState(182);
			pkClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FkClauseContext extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(SqlParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SqlParser.KEY, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(SqlParser.PAREN_OPEN, 0); }
		public List<IdExprContext> idExpr() {
			return getRuleContexts(IdExprContext.class);
		}
		public IdExprContext idExpr(int i) {
			return getRuleContext(IdExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public FkClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fkClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterFkClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitFkClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitFkClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FkClauseContext fkClause() throws RecognitionException {
		FkClauseContext _localctx = new FkClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fkClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(FOREIGN);
			setState(185);
			match(KEY);
			setState(186);
			match(PAREN_OPEN);
			setState(187);
			idExpr();
			{
			setState(188);
			match(COMMA);
			setState(189);
			idExpr();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public FromItemContext fromItem() {
			return getRuleContext(FromItemContext.class,0);
		}
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlParser.ON, 0); }
		public WhereItemContext whereItem() {
			return getRuleContext(WhereItemContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(FROM);
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(192);
				fromItem();
				}
				break;
			case 2:
				{
				setState(193);
				joinClause(0);
				}
				break;
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(196);
				match(ON);
				setState(197);
				whereItem();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinClauseContext extends ParserRuleContext {
		public Token operator;
		public List<FromItemContext> fromItem() {
			return getRuleContexts(FromItemContext.class);
		}
		public FromItemContext fromItem(int i) {
			return getRuleContext(FromItemContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(SqlParser.JOIN, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public TerminalNode CROSS() { return getToken(SqlParser.CROSS, 0); }
		public TerminalNode FULL() { return getToken(SqlParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(SqlParser.RIGHT, 0); }
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		return joinClause(0);
	}

	private JoinClauseContext joinClause(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, _parentState);
		JoinClauseContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_joinClause, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201);
			fromItem();
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				{
				setState(202);
				((JoinClauseContext)_localctx).operator = match(COMMA);
				}
				break;
			case CROSS:
			case FULL:
			case INNER:
			case LEFT:
			case OUTER:
			case RIGHT:
				{
				setState(203);
				((JoinClauseContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (CROSS - 35)) | (1L << (FULL - 35)) | (1L << (INNER - 35)) | (1L << (LEFT - 35)) | (1L << (OUTER - 35)) | (1L << (RIGHT - 35)))) != 0)) ) {
					((JoinClauseContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				match(JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(207);
			fromItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinClauseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_joinClause);
					setState(209);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(213);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						setState(210);
						((JoinClauseContext)_localctx).operator = match(COMMA);
						}
						break;
					case CROSS:
					case FULL:
					case INNER:
					case LEFT:
					case OUTER:
					case RIGHT:
						{
						setState(211);
						((JoinClauseContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (CROSS - 35)) | (1L << (FULL - 35)) | (1L << (INNER - 35)) | (1L << (LEFT - 35)) | (1L << (OUTER - 35)) | (1L << (RIGHT - 35)))) != 0)) ) {
							((JoinClauseContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						match(JOIN);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(215);
					fromItem();
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PkClauseContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(SqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SqlParser.KEY, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(SqlParser.PAREN_OPEN, 0); }
		public List<ColumnItemContext> columnItem() {
			return getRuleContexts(ColumnItemContext.class);
		}
		public ColumnItemContext columnItem(int i) {
			return getRuleContext(ColumnItemContext.class,i);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(SqlParser.PAREN_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public PkClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterPkClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitPkClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitPkClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PkClauseContext pkClause() throws RecognitionException {
		PkClauseContext _localctx = new PkClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pkClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(PRIMARY);
			setState(222);
			match(KEY);
			setState(223);
			match(PAREN_OPEN);
			setState(224);
			columnItem();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(225);
				match(COMMA);
				setState(226);
				columnItem();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(PAREN_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferencesClauseContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(SqlParser.REFERENCES, 0); }
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(SqlParser.PAREN_OPEN, 0); }
		public List<ColumnItemContext> columnItem() {
			return getRuleContexts(ColumnItemContext.class);
		}
		public ColumnItemContext columnItem(int i) {
			return getRuleContext(ColumnItemContext.class,i);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(SqlParser.PAREN_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public ReferencesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencesClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterReferencesClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitReferencesClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitReferencesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencesClauseContext referencesClause() throws RecognitionException {
		ReferencesClauseContext _localctx = new ReferencesClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_referencesClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(REFERENCES);
			setState(235);
			idExpr();
			setState(236);
			match(PAREN_OPEN);
			setState(237);
			columnItem();
			{
			setState(238);
			match(COMMA);
			setState(239);
			columnItem();
			}
			setState(241);
			match(PAREN_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public TerminalNode DISTINCT() { return getToken(SqlParser.DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(SELECT);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(244);
				match(DISTINCT);
				}
			}

			setState(247);
			selectItem();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(248);
				match(COMMA);
				setState(249);
				selectItem();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlParser.WHERE, 0); }
		public WhereItemContext whereItem() {
			return getRuleContext(WhereItemContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(WHERE);
			setState(256);
			whereItem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnItemContext extends ParserRuleContext {
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public ColumnItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterColumnItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitColumnItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitColumnItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnItemContext columnItem() throws RecognitionException {
		ColumnItemContext _localctx = new ColumnItemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_columnItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			idExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromItemContext extends ParserRuleContext {
		public List<IdExprContext> idExpr() {
			return getRuleContexts(IdExprContext.class);
		}
		public IdExprContext idExpr(int i) {
			return getRuleContext(IdExprContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public FromItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterFromItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitFromItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitFromItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromItemContext fromItem() throws RecognitionException {
		FromItemContext _localctx = new FromItemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fromItem);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				idExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				idExpr();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(262);
					match(AS);
					}
				}

				setState(265);
				idExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSelectItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSelectItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selectItem);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				expr(0);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(271);
					match(AS);
					}
				}

				setState(274);
				idExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereItemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterWhereItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitWhereItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitWhereItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereItemContext whereItem() throws RecognitionException {
		WhereItemContext _localctx = new WhereItemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whereItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Token operator;
		public ValueLiteralContext valueLiteral() {
			return getRuleContext(ValueLiteralContext.class,0);
		}
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public IdChainExprContext idChainExpr() {
			return getRuleContext(IdChainExprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(SqlParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(SqlParser.PAREN_CLOSE, 0); }
		public TerminalNode SLASH() { return getToken(SqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlParser.PERCENT, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SqlParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQ() { return getToken(SqlParser.GREATER_THAN_OR_EQ, 0); }
		public TerminalNode LESS_THAN() { return getToken(SqlParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQ() { return getToken(SqlParser.LESS_THAN_OR_EQ, 0); }
		public TerminalNode LIKE() { return getToken(SqlParser.LIKE, 0); }
		public TerminalNode NOT_EQ() { return getToken(SqlParser.NOT_EQ, 0); }
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlParser.OR, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlParser.BETWEEN, 0); }
		public TerminalNode NULL() { return getToken(SqlParser.NULL, 0); }
		public TerminalNode IS() { return getToken(SqlParser.IS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(282);
				valueLiteral();
				}
				break;
			case 2:
				{
				setState(283);
				idExpr();
				}
				break;
			case 3:
				{
				setState(284);
				idChainExpr();
				}
				break;
			case 4:
				{
				setState(285);
				((ExprContext)_localctx).operator = match(MINUS);
				setState(286);
				expr(11);
				}
				break;
			case 5:
				{
				setState(287);
				((ExprContext)_localctx).operator = match(NOT);
				setState(288);
				expr(5);
				}
				break;
			case 6:
				{
				setState(289);
				match(PAREN_OPEN);
				setState(290);
				expr(0);
				setState(291);
				match(PAREN_CLOSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(296);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERCENT) | (1L << SLASH) | (1L << STAR))) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(297);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(299);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(300);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(302);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GREATER_THAN) | (1L << GREATER_THAN_OR_EQ) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQ) | (1L << NOT_EQ))) != 0) || _la==LIKE) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(303);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(304);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(305);
						((ExprContext)_localctx).operator = match(AND);
						setState(306);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(308);
						((ExprContext)_localctx).operator = match(OR);
						setState(309);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(311);
						((ExprContext)_localctx).operator = match(BETWEEN);
						setState(312);
						expr(0);
						setState(313);
						match(AND);
						setState(314);
						expr(3);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(316);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(317);
						((ExprContext)_localctx).operator = match(IS);
						setState(318);
						match(NULL);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(319);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(320);
						((ExprContext)_localctx).operator = match(IS);
						setState(321);
						match(NOT);
						setState(322);
						match(NULL);
						}
						break;
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdExprContext extends ParserRuleContext {
		public TerminalNode IdentiferLiteral() { return getToken(SqlParser.IdentiferLiteral, 0); }
		public IdExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdExprContext idExpr() throws RecognitionException {
		IdExprContext _localctx = new IdExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_idExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(IdentiferLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdChainExprContext extends ParserRuleContext {
		public Token operator;
		public List<IdExprContext> idExpr() {
			return getRuleContexts(IdExprContext.class);
		}
		public IdExprContext idExpr(int i) {
			return getRuleContext(IdExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public IdChainExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idChainExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterIdChainExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitIdChainExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitIdChainExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdChainExprContext idChainExpr() throws RecognitionException {
		IdChainExprContext _localctx = new IdChainExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_idChainExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			idExpr();
			setState(331);
			((IdChainExprContext)_localctx).operator = match(DOT);
			setState(332);
			idExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetExprContext extends ParserRuleContext {
		public ColumnItemContext columnItem() {
			return getRuleContext(ColumnItemContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExprContext setExpr() throws RecognitionException {
		SetExprContext _localctx = new SetExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_setExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			columnItem();
			setState(335);
			match(EQ);
			setState(336);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueLiteralContext extends ParserRuleContext {
		public TerminalNode NumericLiteral() { return getToken(SqlParser.NumericLiteral, 0); }
		public TerminalNode DigitsLiteral() { return getToken(SqlParser.DigitsLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SqlParser.StringLiteral, 0); }
		public TerminalNode TRUE() { return getToken(SqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlParser.FALSE, 0); }
		public ValueLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterValueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitValueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitValueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueLiteralContext valueLiteral() throws RecognitionException {
		ValueLiteralContext _localctx = new ValueLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_valueLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !(_la==FALSE || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (TRUE - 111)) | (1L << (DigitsLiteral - 111)) | (1L << (NumericLiteral - 111)) | (1L << (StringLiteral - 111)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitsContext extends ParserRuleContext {
		public TerminalNode DigitsLiteral() { return getToken(SqlParser.DigitsLiteral, 0); }
		public DigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitDigits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitDigits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitsContext digits() throws RecognitionException {
		DigitsContext _localctx = new DigitsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_digits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(DigitsLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return joinClause_sempred((JoinClauseContext)_localctx, predIndex);
		case 23:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean joinClause_sempred(JoinClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0084\u0157\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000J\b"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001R\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002Z\b\u0002\n\u0002\f\u0002]\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002a\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002e\b\u0002\n\u0002\f\u0002h\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003o\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004x\b\u0004\n\u0004\f\u0004{\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0083"+
		"\b\u0004\n\u0004\f\u0004\u0086\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u008d\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0099\b\u0007\n\u0007\f\u0007\u009c"+
		"\t\u0007\u0001\u0007\u0003\u0007\u009f\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a9\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0003\n\u00af\b\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0003\u000b\u00b5\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u00c3"+
		"\b\r\u0001\r\u0001\r\u0003\r\u00c7\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00ce\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d6\b\u000e"+
		"\u0001\u000e\u0005\u000e\u00d9\b\u000e\n\u000e\f\u000e\u00dc\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00e4\b\u000f\n\u000f\f\u000f\u00e7\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00f6\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00fb\b"+
		"\u0011\n\u0011\f\u0011\u00fe\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0108\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010c\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0111\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0116\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0126\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0144\b\u0017\n\u0017\f\u0017\u0147\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0000\u0002\u001c.\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0005"+
		"\u0006\u0000##88AAIIZZaa\u0002\u0000\r\r\u0010\u0011\u0002\u0000\t\t\u000e"+
		"\u000e\u0003\u0000\u0004\b\n\nJJ\u0004\u000022oo\u0081\u0082\u0084\u0084"+
		"\u0166\u0000I\u0001\u0000\u0000\u0000\u0002Q\u0001\u0000\u0000\u0000\u0004"+
		"S\u0001\u0000\u0000\u0000\u0006k\u0001\u0000\u0000\u0000\bp\u0001\u0000"+
		"\u0000\u0000\n\u0089\u0001\u0000\u0000\u0000\f\u008e\u0001\u0000\u0000"+
		"\u0000\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u00a0\u0001\u0000\u0000"+
		"\u0000\u0012\u00aa\u0001\u0000\u0000\u0000\u0014\u00ae\u0001\u0000\u0000"+
		"\u0000\u0016\u00b4\u0001\u0000\u0000\u0000\u0018\u00b8\u0001\u0000\u0000"+
		"\u0000\u001a\u00bf\u0001\u0000\u0000\u0000\u001c\u00c8\u0001\u0000\u0000"+
		"\u0000\u001e\u00dd\u0001\u0000\u0000\u0000 \u00ea\u0001\u0000\u0000\u0000"+
		"\"\u00f3\u0001\u0000\u0000\u0000$\u00ff\u0001\u0000\u0000\u0000&\u0102"+
		"\u0001\u0000\u0000\u0000(\u010b\u0001\u0000\u0000\u0000*\u0115\u0001\u0000"+
		"\u0000\u0000,\u0117\u0001\u0000\u0000\u0000.\u0125\u0001\u0000\u0000\u0000"+
		"0\u0148\u0001\u0000\u0000\u00002\u014a\u0001\u0000\u0000\u00004\u014e"+
		"\u0001\u0000\u0000\u00006\u0152\u0001\u0000\u0000\u00008\u0154\u0001\u0000"+
		"\u0000\u0000:;\u0003\u0002\u0001\u0000;A\u0005\u000f\u0000\u0000<=\u0003"+
		"\u0002\u0001\u0000=>\u0005\u000f\u0000\u0000>@\u0001\u0000\u0000\u0000"+
		"?<\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000DE\u0005\u0000\u0000\u0001EJ\u0001\u0000\u0000\u0000FG\u0003"+
		"\u0002\u0001\u0000GH\u0005\u0000\u0000\u0001HJ\u0001\u0000\u0000\u0000"+
		"I:\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000J\u0001\u0001\u0000"+
		"\u0000\u0000KR\u0003\u0004\u0002\u0000LR\u0003\u0006\u0003\u0000MR\u0003"+
		"\b\u0004\u0000NR\u0003\n\u0005\u0000OR\u0003\f\u0006\u0000PR\u0003\u000e"+
		"\u0007\u0000QK\u0001\u0000\u0000\u0000QL\u0001\u0000\u0000\u0000QM\u0001"+
		"\u0000\u0000\u0000QN\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"QP\u0001\u0000\u0000\u0000R\u0003\u0001\u0000\u0000\u0000ST\u0005\"\u0000"+
		"\u0000TU\u00030\u0018\u0000UV\u0005\u000b\u0000\u0000V[\u0003\u0010\b"+
		"\u0000WX\u0005\u0002\u0000\u0000XZ\u0003\u0010\b\u0000YW\u0001\u0000\u0000"+
		"\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\`\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005"+
		"\u0002\u0000\u0000_a\u0003\u0016\u000b\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000af\u0001\u0000\u0000\u0000bc\u0005\u0002\u0000"+
		"\u0000ce\u0003\u0014\n\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\f\u0000\u0000j\u0005\u0001"+
		"\u0000\u0000\u0000kl\u0005)\u0000\u0000ln\u0003\u001a\r\u0000mo\u0003"+
		"$\u0012\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0007"+
		"\u0001\u0000\u0000\u0000pq\u0005B\u0000\u0000qr\u0005F\u0000\u0000rs\u0003"+
		"0\u0018\u0000st\u0005\u000b\u0000\u0000ty\u0003&\u0013\u0000uv\u0005\u0002"+
		"\u0000\u0000vx\u0003&\u0013\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\f\u0000\u0000}~\u0005"+
		"w\u0000\u0000~\u007f\u0005\u000b\u0000\u0000\u007f\u0084\u00036\u001b"+
		"\u0000\u0080\u0081\u0005\u0002\u0000\u0000\u0081\u0083\u00036\u001b\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\f\u0000\u0000\u0088\t\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0003\"\u0011\u0000\u008a\u008c\u0003\u001a\r\u0000\u008b\u008d"+
		"\u0003$\u0012\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u000b\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"p\u0000\u0000\u008f\u0090\u0005j\u0000\u0000\u0090\u0091\u00030\u0018"+
		"\u0000\u0091\r\u0001\u0000\u0000\u0000\u0092\u0093\u0005s\u0000\u0000"+
		"\u0093\u0094\u00030\u0018\u0000\u0094\u0095\u0005i\u0000\u0000\u0095\u009a"+
		"\u00034\u001a\u0000\u0096\u0097\u0005\u0002\u0000\u0000\u0097\u0099\u0003"+
		"4\u001a\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009d\u009f\u0003$\u0012\u0000\u009e\u009d\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u000f\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0003&\u0013\u0000\u00a1\u00a2\u00030\u0018\u0000\u00a2"+
		"\u00a3\u0005\u000b\u0000\u0000\u00a3\u00a4\u00038\u001c\u0000\u00a4\u00a5"+
		"\u0005\f\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"+
		"Q\u0000\u0000\u00a7\u00a9\u0005R\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u0011\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005!\u0000\u0000\u00ab\u00ac\u00030\u0018\u0000\u00ac"+
		"\u0013\u0001\u0000\u0000\u0000\u00ad\u00af\u0003\u0012\t\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\u0018\f\u0000\u00b1\u00b2\u0003"+
		" \u0010\u0000\u00b2\u0015\u0001\u0000\u0000\u0000\u00b3\u00b5\u0003\u0012"+
		"\t\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003\u001e\u000f"+
		"\u0000\u00b7\u0017\u0001\u0000\u0000\u0000\u00b8\u00b9\u00056\u0000\u0000"+
		"\u00b9\u00ba\u0005=\u0000\u0000\u00ba\u00bb\u0005\u000b\u0000\u0000\u00bb"+
		"\u00bc\u00030\u0018\u0000\u00bc\u00bd\u0005\u0002\u0000\u0000\u00bd\u00be"+
		"\u00030\u0018\u0000\u00be\u0019\u0001\u0000\u0000\u0000\u00bf\u00c2\u0005"+
		"7\u0000\u0000\u00c0\u00c3\u0003(\u0014\u0000\u00c1\u00c3\u0003\u001c\u000e"+
		"\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005U\u0000\u0000"+
		"\u00c5\u00c7\u0003,\u0016\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u001b\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0006\u000e\uffff\uffff\u0000\u00c9\u00cd\u0003(\u0014\u0000\u00ca"+
		"\u00ce\u0005\u0002\u0000\u0000\u00cb\u00cc\u0007\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0005H\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0003(\u0014\u0000\u00d0\u00da\u0001\u0000\u0000\u0000\u00d1\u00d5\n"+
		"\u0001\u0000\u0000\u00d2\u00d6\u0005\u0002\u0000\u0000\u00d3\u00d4\u0007"+
		"\u0000\u0000\u0000\u00d4\u00d6\u0005H\u0000\u0000\u00d5\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d9\u0003(\u0014\u0000\u00d8\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u001d\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0005[\u0000\u0000"+
		"\u00de\u00df\u0005=\u0000\u0000\u00df\u00e0\u0005\u000b\u0000\u0000\u00e0"+
		"\u00e5\u0003&\u0013\u0000\u00e1\u00e2\u0005\u0002\u0000\u0000\u00e2\u00e4"+
		"\u0003&\u0013\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005\f\u0000\u0000\u00e9\u001f\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0005]\u0000\u0000\u00eb\u00ec\u00030\u0018\u0000"+
		"\u00ec\u00ed\u0005\u000b\u0000\u0000\u00ed\u00ee\u0003&\u0013\u0000\u00ee"+
		"\u00ef\u0005\u0002\u0000\u0000\u00ef\u00f0\u0003&\u0013\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\f\u0000\u0000\u00f2!\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0005h\u0000\u0000\u00f4\u00f6\u0005*\u0000"+
		"\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fc\u0003*\u0015\u0000"+
		"\u00f8\u00f9\u0005\u0002\u0000\u0000\u00f9\u00fb\u0003*\u0015\u0000\u00fa"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"#\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005z\u0000\u0000\u0100\u0101\u0003,\u0016\u0000\u0101%\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u00030\u0018\u0000\u0103\'\u0001\u0000\u0000"+
		"\u0000\u0104\u010c\u00030\u0018\u0000\u0105\u0107\u00030\u0018\u0000\u0106"+
		"\u0108\u0005\u0016\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u00030\u0018\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0104"+
		"\u0001\u0000\u0000\u0000\u010b\u0105\u0001\u0000\u0000\u0000\u010c)\u0001"+
		"\u0000\u0000\u0000\u010d\u0116\u0005\u0011\u0000\u0000\u010e\u0110\u0003"+
		".\u0017\u0000\u010f\u0111\u0005\u0016\u0000\u0000\u0110\u010f\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u00030\u0018\u0000\u0113\u0116\u0001\u0000\u0000"+
		"\u0000\u0114\u0116\u0003.\u0017\u0000\u0115\u010d\u0001\u0000\u0000\u0000"+
		"\u0115\u010e\u0001\u0000\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000"+
		"\u0116+\u0001\u0000\u0000\u0000\u0117\u0118\u0003.\u0017\u0000\u0118-"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0006\u0017\uffff\uffff\u0000\u011a"+
		"\u0126\u00036\u001b\u0000\u011b\u0126\u00030\u0018\u0000\u011c\u0126\u0003"+
		"2\u0019\u0000\u011d\u011e\u0005\t\u0000\u0000\u011e\u0126\u0003.\u0017"+
		"\u000b\u011f\u0120\u0005Q\u0000\u0000\u0120\u0126\u0003.\u0017\u0005\u0121"+
		"\u0122\u0005\u000b\u0000\u0000\u0122\u0123\u0003.\u0017\u0000\u0123\u0124"+
		"\u0005\f\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0119\u0001"+
		"\u0000\u0000\u0000\u0125\u011b\u0001\u0000\u0000\u0000\u0125\u011c\u0001"+
		"\u0000\u0000\u0000\u0125\u011d\u0001\u0000\u0000\u0000\u0125\u011f\u0001"+
		"\u0000\u0000\u0000\u0125\u0121\u0001\u0000\u0000\u0000\u0126\u0145\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\n\n\u0000\u0000\u0128\u0129\u0007\u0001"+
		"\u0000\u0000\u0129\u0144\u0003.\u0017\u000b\u012a\u012b\n\t\u0000\u0000"+
		"\u012b\u012c\u0007\u0002\u0000\u0000\u012c\u0144\u0003.\u0017\n\u012d"+
		"\u012e\n\u0006\u0000\u0000\u012e\u012f\u0007\u0003\u0000\u0000\u012f\u0144"+
		"\u0003.\u0017\u0007\u0130\u0131\n\u0004\u0000\u0000\u0131\u0132\u0005"+
		"\u0015\u0000\u0000\u0132\u0144\u0003.\u0017\u0005\u0133\u0134\n\u0003"+
		"\u0000\u0000\u0134\u0135\u0005W\u0000\u0000\u0135\u0144\u0003.\u0017\u0004"+
		"\u0136\u0137\n\u0002\u0000\u0000\u0137\u0138\u0005\u0019\u0000\u0000\u0138"+
		"\u0139\u0003.\u0017\u0000\u0139\u013a\u0005\u0015\u0000\u0000\u013a\u013b"+
		"\u0003.\u0017\u0003\u013b\u0144\u0001\u0000\u0000\u0000\u013c\u013d\n"+
		"\b\u0000\u0000\u013d\u013e\u0005G\u0000\u0000\u013e\u0144\u0005R\u0000"+
		"\u0000\u013f\u0140\n\u0007\u0000\u0000\u0140\u0141\u0005G\u0000\u0000"+
		"\u0141\u0142\u0005Q\u0000\u0000\u0142\u0144\u0005R\u0000\u0000\u0143\u0127"+
		"\u0001\u0000\u0000\u0000\u0143\u012a\u0001\u0000\u0000\u0000\u0143\u012d"+
		"\u0001\u0000\u0000\u0000\u0143\u0130\u0001\u0000\u0000\u0000\u0143\u0133"+
		"\u0001\u0000\u0000\u0000\u0143\u0136\u0001\u0000\u0000\u0000\u0143\u013c"+
		"\u0001\u0000\u0000\u0000\u0143\u013f\u0001\u0000\u0000\u0000\u0144\u0147"+
		"\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0001\u0000\u0000\u0000\u0146/\u0001\u0000\u0000\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0005\u0083\u0000\u0000\u01491\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u00030\u0018\u0000\u014b\u014c\u0005\u0003\u0000"+
		"\u0000\u014c\u014d\u00030\u0018\u0000\u014d3\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0003&\u0013\u0000\u014f\u0150\u0005\u0004\u0000\u0000\u0150\u0151"+
		"\u0003.\u0017\u0000\u01515\u0001\u0000\u0000\u0000\u0152\u0153\u0007\u0004"+
		"\u0000\u0000\u01537\u0001\u0000\u0000\u0000\u0154\u0155\u0005\u0081\u0000"+
		"\u0000\u01559\u0001\u0000\u0000\u0000\u001eAIQ[`fny\u0084\u008c\u009a"+
		"\u009e\u00a8\u00ae\u00b4\u00c2\u00c6\u00cd\u00d5\u00da\u00e5\u00f5\u00fc"+
		"\u0107\u010b\u0110\u0115\u0125\u0143\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}