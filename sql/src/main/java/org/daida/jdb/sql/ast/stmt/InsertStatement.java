package org.daida.jdb.sql.ast.stmt;

import org.daida.jdb.sql.ast.Identifier;
import org.daida.jdb.sql.ast.literal.ValueLiteral;

import java.util.List;

public record InsertStatement(
        Identifier table,
        List<Identifier> columns,
        List<ValueLiteral> values
) implements Statement {
}
