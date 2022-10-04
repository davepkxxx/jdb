package org.daida.jdb.sql.ast;

import org.daida.jdb.sql.ast.expr.Expression;
import org.daida.jdb.sql.ast.frag.FromItem;
import org.daida.jdb.sql.ast.frag.SelectItem;
import org.daida.jdb.sql.ast.frag.WhereItem;

public record Identifier(String value) implements Expression, FromItem, SelectItem, WhereItem {
}
