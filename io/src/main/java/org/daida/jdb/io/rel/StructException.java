package org.daida.jdb.io.rel;

public class StructException extends RuntimeException {
    public final String structId;

    public final StructType structType;

    public StructException(String structId, StructType structType) {
        this.structId = structId;
        this.structType = structType;
    }
}
