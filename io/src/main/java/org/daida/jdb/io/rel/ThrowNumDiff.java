package org.daida.jdb.io.rel;

interface ThrowNumDiff {
    String getId();

    StructType getStructType();

    default void throwNumDiff(String... sources) throws StructNumDiffException {
        throw new StructNumDiffException(this.getId(), this.getStructType(), sources);
    }
}
