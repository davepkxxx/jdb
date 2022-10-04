package org.daida.jdb.sql.ast.clause;

import org.daida.jdb.sql.ast.SyntaxNode;
import org.daida.jdb.sql.ast.expr.Expression;
import org.daida.jdb.sql.ast.frag.FromItem;

public record FromClause(FromItem fromItem, Expression on) implements SyntaxNode {
}
