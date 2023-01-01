package org.daida.jdb.io.rel;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class StructNotFoundExceptionTest {

    @Test
    void getMessage() {
        var instance = new StructNotFoundException(
                UUID.randomUUID().toString(),
                StructType.COLUMN,
                UUID.randomUUID().toString(),
                StructType.TABLE
        );
        assertEquals(instance.getMessage(), String.format("The column %s was not found in the table %s", instance.structId, instance.locationId));
    }
}