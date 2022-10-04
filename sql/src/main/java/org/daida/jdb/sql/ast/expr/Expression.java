package org.daida.jdb.sql.ast.expr;

import org.daida.jdb.sql.ast.SyntaxNode;
import org.daida.jdb.sql.ast.frag.SelectItem;
import org.daida.jdb.sql.ast.frag.WhereItem;

public interface Expression extends SyntaxNode, SelectItem, WhereItem {
}
