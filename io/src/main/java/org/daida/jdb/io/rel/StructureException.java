package org.daida.jdb.io.rel;

public class StructureException extends RuntimeException {
    public final String structureId;

    public final StructType structureType;

    public StructureException(String structureId, StructType structureType) {
        this.structureId = structureId;
        this.structureType = structureType;
    }
}
