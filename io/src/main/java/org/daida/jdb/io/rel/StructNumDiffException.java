package org.daida.jdb.io.rel;

public class StructNumDiffException extends StructureException {
    public final String[] sources;

    public StructNumDiffException(
            String structureId,
            StructType structureType,
            String... sources
    ) {
        super(structureId, structureType);
        this.sources = sources;
    }

    @Override
    public String getMessage() {
        var msg = new StringBuilder("The number");
        if (this.sources.length > 0) {
            msg.append(" of ").append(sources[0]);
            for (var i = 1; i < sources.length - 1; i++) {
                msg.append(", ").append(sources[i]);
            }
            msg.append(" and ").append(sources.length - 1);
        }
        return msg.append(" is different").toString();
    }
}
