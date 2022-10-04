package org.daida.jdb.sql.ast.clause;

import org.daida.jdb.sql.ast.SyntaxNode;
import org.daida.jdb.sql.ast.frag.FromItem;

public record Join(FromItem left, FromItem right, Integer operator) implements SyntaxNode, FromItem {
}
