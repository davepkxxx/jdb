package org.daida.jdb.sql.ast.clause;

import org.daida.jdb.sql.ast.SyntaxNode;
import org.daida.jdb.sql.ast.frag.SelectItem;

import java.util.List;

public record SelectClause(List<Alias<SelectItem>> selectItems, Boolean distinct) implements SyntaxNode {
}
