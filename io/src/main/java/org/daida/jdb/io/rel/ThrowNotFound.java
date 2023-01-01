package org.daida.jdb.io.rel;

import java.util.function.Supplier;

interface ThrowNotFound extends StructModel {
    default <T> Supplier<? extends T> notFoundSupplier(String structId, StructType structType) {
        return () -> { throw new StructNotFoundException(structId, structType, this.getId(), this.getStructType()); };
    }
}