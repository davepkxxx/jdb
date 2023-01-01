package org.daida.jdb.io.rel;

public class StructNotFoundException extends StructException {
    public final String locationId;

    public final StructType locationType;

    public StructNotFoundException(
            String structId,
            StructType structType,
            String locationId,
            StructType locationType
    ) {
        super(structId, structType);
        this.locationId = locationId;
        this.locationType = locationType;
    }

    @Override
    public String getMessage() {
        return String.format("The %s %s was not found in the %s %s",
                this.structType.getName(),
                this.structId,
                this.locationType.getName(),
                this.locationId);
    }
}
