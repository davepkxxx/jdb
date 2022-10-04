package org.daida.jdb.sql.ast.expr;

import org.daida.jdb.sql.ast.frag.FromItem;
import org.daida.jdb.sql.ast.Identifier;
import org.daida.jdb.sql.ast.frag.WhereItem;

public record ChainExpr(Expression left, Identifier right) implements Expression, FromItem, WhereItem {
}
