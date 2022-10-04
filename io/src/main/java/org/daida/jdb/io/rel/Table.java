package org.daida.jdb.io.rel;

import java.util.List;

public record Table(
        String name,
        List<Column> columns,
        PrimaryKey primaryKey,
        List<ForeignKey> foreignKeys
) {
}
