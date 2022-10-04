package org.daida.jdb.io.rel;

public record Column(
        String name,
        String dataType,
        int dataLength,
        boolean notNull
) {
}
