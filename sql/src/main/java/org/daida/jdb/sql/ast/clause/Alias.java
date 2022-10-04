package org.daida.jdb.sql.ast.clause;

import org.daida.jdb.sql.ast.Identifier;
import org.daida.jdb.sql.ast.SyntaxNode;
import org.daida.jdb.sql.ast.frag.FromItem;
import org.daida.jdb.sql.ast.frag.SelectItem;

public record Alias<T>(T left, Identifier right) implements SyntaxNode, FromItem, SelectItem {
}
