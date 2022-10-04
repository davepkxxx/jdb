package org.daida.jdb.sql.ast.stmt;

import org.daida.jdb.sql.ast.Identifier;
import org.daida.jdb.sql.ast.expr.SetExpr;
import org.daida.jdb.sql.ast.expr.Expression;

import java.util.List;

public record UpdateStatement(
        Identifier table,
        List<SetExpr> sets,
        Expression where
) implements Statement {
}
