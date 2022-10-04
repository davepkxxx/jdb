package org.daida.jdb.io.rel;

import java.util.Map;

public record ForeignKey(
        String name,
        String tableName,
        Map<String, String> columnNames
) {
}
