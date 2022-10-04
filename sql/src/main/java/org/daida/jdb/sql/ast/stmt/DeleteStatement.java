package org.daida.jdb.sql.ast.stmt;

import org.daida.jdb.sql.ast.clause.FromClause;
import org.daida.jdb.sql.ast.expr.Expression;

public record DeleteStatement(FromClause fromClause, Expression where) implements Statement {
}
