package org.daida.jdb.io.rel;

public class StructNumDiffException extends StructException {
    public final String[] sources;

    public StructNumDiffException(String structId, StructType structType, String... sources) {
        super(structId, structType);
        this.sources = sources;
    }

    @Override
    public String getMessage() {
        var msg = new StringBuilder("The number");
        for (var i = 0; i < sources.length; i++) {
            var separator = i == 0 ? " of " : (i == sources.length - 1 ? " and " : ", ");
            msg.append(separator).append(sources[i]);
        }
        return msg.append(" is different in the ").append(this.structType.getName()).append(" ").append(this.structId).toString();
    }
}
