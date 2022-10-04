lexer grammar SqlLexer;

options { caseInsensitive = true; }

// signs
COLON:              ':';
COMMA:              ',';
DOT:                '.';
EQ:                 '=';
GREATER_THAN:       '>';
GREATER_THAN_OR_EQ: '>=';
LESS_THAN:          '<';
LESS_THAN_OR_EQ:    '<=';
MINUS:              '-';
NOT_EQ:             '<>';
PAREN_OPEN:         '(';
PAREN_CLOSE:        ')';
PERCENT:            '%';
PLUS:               '+';
SEMI:               ';';
SLASH:              '/';
STAR:               '*';

// keywords
ADD:                'ADD';
ALERT:              'ALERT';
ALL:                'ALL';
AND:                'AND';
AS:                 'AS';
ASC:                'ASC';
BEGIN:              'BEGIN';
BETWEEN:            'BETWEEN';
BY:                 'BY';
CASE:               'CASE';
CAST:               'CAST';
CHECK:              'CHECK';
CLOSE:              'CLOSE';
COLUMN:             'COLUMN';
COMMIT:             'COMMIT';
CONSTRAINT:         'CONSTRAINT';
CREATE:             'CREATE';
CROSS:              'CROSS';
CURSOR:             'CURSOR';
DATABASE:           'DATABASE';
DESC:               'DESC';
DECLARE:            'DECLARE';
DEFAULT:            'DEFAULT';
DELETE:             'DELETE';
DISTINCT:           'DISTINCT';
DROP:               'DROP';
ELSE:               'ELSE';
END:                'END';
EXCEPT:             'EXCEPT';
EXEC:               'EXEC';
EXECUTE:            'EXECUTE';
EXIST:              'EXIST';
FALSE:              'FALSE';
FETCH:              'FETCH';
FIRST:              'FIRST';
FOR:                'FOR';
FOREIGN:            'FOREIGN';
FROM:               'FROM';
FULL:               'FULL';
FUNCTION:           'FUNCTION';
GRANT:              'GRANT';
GROUP:              'GROUP';
HAVING:             'HAVING';
KEY:                'KEY';
IF:                 'IF';
IN:                 'IN';
INDEX:              'INDEX';
INNER:              'INNER';
INSERT:             'INSERT';
INSTEAD:            'INSTEAD';
INTERSECT:          'INTERSECT';
INOUT:              'INOUT';
INTO:               'INTO';
IS:                 'IS';
JOIN:               'JOIN';
LEFT:               'LEFT';
LIKE:               'LIKE';
LOCK:               'LOCK';
LOOP:               'LOOP';
MATCHED:            'MATCHED';
MERGE:              'MERGE';
NATURAL:            'NATURAL';
NEXT:               'NEXT';
NOT:                'NOT';
NULL:               'NULL';
OF:                 'OF';
OFFSET:             'OFFSET';
ON:                 'ON';
ONLY:               'ONLY';
OR:                 'OR';
ORDER:              'ORDER';
OUT:                'OUT';
OUTER:              'OUTER';
PRIMARY:            'PRIMARY';
PROCEDURE:          'PROCEDURE';
REFERENCES:         'REFERENCES';
RENAME:             'RENAME';
RETURN:             'RETURN';
REVOKE:             'REVOKE';
RIGHT:              'RIGHT';
ROLE:               'ROLE';
ROLLBACK:           'ROLLBACK';
ROW:                'ROW';
ROWS:               'ROWS';
SAVE:               'SAVE';
SCHEMA:             'SCHEMA';
SELECT:             'SELECT';
SET:                'SET';
TABLE:              'TABLE';
THEN:               'THEN';
TO:                 'TO';
TRANSACTION:        'TRANSACTION';
TRIGGER:            'TRIGGER';
TRUE:               'TRUE';
TRUNCATE:           'TRUNCATE';
UNION:              'UNION';
UNIQUE:             'UNIQUE';
UPDATE:             'UPDATE';
USE:                'USE';
USER:               'USER';
USING:              'USING';
VALUES:             'VALUES';
VIEW:               'VIEW';
WHEN:               'WHEN';
WHERE:              'WHERE';
WHILE:              'WHILE';
WITH:               'WITH';

// comments
BlockComment:       ('/*' ('/'* BlockComment | ~ [/*] | '/'+ ~ [/*] | '*'+ ~ [/*])* '*'* '*/') -> channel (HIDDEN);
LineComment:        '--' ~ [\r\n]* -> channel (HIDDEN);


Newline:            ('\r' '\n'? | '\n') -> channel (HIDDEN);
Whitespace:         [ \t]+ -> channel (HIDDEN);

// literals
DigitsLiteral:      [0-9]+;
NumericLiteral:     [0-9]+ '.' [0-9]+;
IdentiferLiteral:   [a-z] [a-z0-9_]*;
StringLiteral:      '"' (~["\r\n])* '"';