package org.daida.jdb.io.rel;

import java.util.List;

public record PrimaryKey(
        String name,
        List<String> columnNames
) {
}
