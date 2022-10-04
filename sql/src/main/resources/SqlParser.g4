parser grammar SqlParser;

options { tokenVocab = SqlLexer; }

prog
    : stmt SEMI (stmt SEMI)* EOF
    | stmt EOF
    ;
// statments
stmt
    : createTableStmt
    | deleteStmt
    | insertStmt
    | selectStmt
    | truncateStmt
    | updateStmt
    ;
createTableStmt
    : CREATE idExpr PAREN_OPEN columnClause (COMMA columnClause)* (COMMA cstrPkClause)? (COMMA cstrFkClause)* PAREN_CLOSE
    ;
deleteStmt
    : DELETE fromClause (whereClause)?
    ;
insertStmt
    : INSERT INTO idExpr PAREN_OPEN columnItem (COMMA columnItem)* PAREN_CLOSE VALUES PAREN_OPEN valueLiteral (COMMA valueLiteral)* PAREN_CLOSE
    ;
selectStmt
    : selectClause fromClause (whereClause)?
    ;
truncateStmt
    : TRUNCATE TABLE idExpr
    ;
updateStmt
    : UPDATE idExpr SET setExpr (COMMA setExpr)* (whereClause)?
    ;
// clauses
columnClause
    : columnItem idExpr (PAREN_OPEN digits PAREN_CLOSE) (NOT NULL)?
    ;
cstrClause
    : CONSTRAINT idExpr
    ;
cstrFkClause
    : cstrClause? fkClause referencesClause
    ;
cstrPkClause
    : cstrClause? pkClause
    ;
fkClause
    : FOREIGN KEY PAREN_OPEN idExpr (COMMA idExpr)
    ;
fromClause
    : FROM (fromItem | joinClause) (ON whereItem)?
    ;
joinClause
    : fromItem (operator=COMMA | operator=(CROSS | FULL | INNER | LEFT | OUTER | RIGHT) JOIN) fromItem
    | joinClause (operator=COMMA | operator=(CROSS | FULL | INNER | LEFT | OUTER | RIGHT) JOIN) fromItem
    ;
pkClause
    : PRIMARY KEY PAREN_OPEN columnItem (COMMA columnItem)* PAREN_CLOSE
    ;
referencesClause
    : REFERENCES idExpr PAREN_OPEN columnItem (COMMA columnItem) PAREN_CLOSE
    ;
selectClause
    : SELECT DISTINCT? selectItem (COMMA selectItem)*
    ;
whereClause
    : WHERE whereItem
    ;
// items
columnItem
    : idExpr
    ;
fromItem
    : idExpr
    | idExpr AS? idExpr
    ;
selectItem
    : STAR
    | expr AS? idExpr
    | expr
    ;
whereItem
    : expr
    ;

// exprs
expr
    : valueLiteral
    | idExpr
    | idChainExpr
    | operator=MINUS expr
    | expr operator=(SLASH | PERCENT | STAR) expr
    | expr operator=(MINUS | PLUS) expr
    | expr operator=IS NULL
    | expr operator=IS NOT NULL
    | expr operator=(EQ | GREATER_THAN | GREATER_THAN_OR_EQ | LESS_THAN | LESS_THAN_OR_EQ | LIKE | NOT_EQ) expr
    | operator=NOT expr
    | expr operator=AND expr
    | expr operator=OR expr
    | expr operator=BETWEEN expr AND expr
    | PAREN_OPEN expr PAREN_CLOSE
    ;
idExpr
    : IdentiferLiteral
    ;
idChainExpr
    : idExpr operator=DOT idExpr
    ;
setExpr
    : columnItem EQ expr
    ;

// literal
valueLiteral
    : NumericLiteral
    | DigitsLiteral
    | StringLiteral
    | TRUE
    | FALSE
    ;
digits
    : DigitsLiteral
    ;