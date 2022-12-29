package org.daida.jdb.io.rel;

public class StructNotFoundException extends StructureException {
    public final String locationId;

    public final StructType locationType;

    public StructNotFoundException(
            String structureId,
            StructType structureType,
            String locationId,
            StructType locationType
    ) {
        super(structureId, structureType);
        this.locationId = locationId;
        this.locationType = locationType;
    }

    private static String generateMessage(
            String structureId,
            StructType structureType,
            String locationId,
            StructType locationType
    ) {
        return String.format("The %s %s was not found in the %s %s", structureType.getName(), structureId, locationType.getName(), locationId);
    }

    @Override
    public String getMessage() {
        return String.format("The %s %s was not found in the %s %s",
                this.structureType.getName(),
                this.structureId,
                this.locationType.getName(),
                this.locationId);
    }
}
