package org.daida.jdb.sql.ast.clause;

import org.daida.jdb.sql.ast.Identifier;
import org.daida.jdb.sql.ast.SyntaxNode;

import java.util.List;

public record ReferencesClause(Identifier table, List<Identifier> columns) implements SyntaxNode {
}
