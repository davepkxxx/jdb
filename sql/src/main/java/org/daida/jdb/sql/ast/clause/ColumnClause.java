package org.daida.jdb.sql.ast.clause;

import org.daida.jdb.sql.ast.Identifier;
import org.daida.jdb.sql.ast.SyntaxNode;
import org.daida.jdb.sql.ast.literal.Digits;

public record ColumnClause(
        Identifier column,
        Identifier dataType,
        Digits dataLength,
        Boolean notNull
) implements SyntaxNode {
}
