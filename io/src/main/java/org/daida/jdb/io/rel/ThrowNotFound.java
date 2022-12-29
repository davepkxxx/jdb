package org.daida.jdb.io.rel;

import java.util.function.Supplier;

interface ThrowNotFound {
    String getId();

    StructType getStructType();

    default <T> Supplier<? extends T> notFoundSupplier(String structureId, StructType structureType) {
        return () -> {
            throw new StructNotFoundException(structureId, structureType, this.getId(), this.getStructType());
        };
    }
}