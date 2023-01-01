package org.daida.jdb.io.rel;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.daida.jdb.io.rel.StructType.*;
import static org.junit.jupiter.api.Assertions.*;

class StructNumDiffExceptionTest {
    @Nested
    class GetMessageTest {
        @Test
        void noResource() {
            var instance = new StructNumDiffException(UUID.randomUUID().toString(), PRIMARY_KEY);
            assertEquals(instance.getMessage(),
                    "The number is different in the primary key " + instance.structId);
        }

        @Test
        void oneResource() {
            var instance = new StructNumDiffException(UUID.randomUUID().toString(), FOREIGN_KEY, "columns");
            assertEquals(instance.getMessage(),
                    "The number of columns is different in the foreign key " + instance.structId);
        }

        @Test
        void twoResource() {
            var instance = new StructNumDiffException(UUID.randomUUID().toString(), COLUMN, PRIMARY_KEY.getName(), FOREIGN_KEY.getName());
            assertEquals(instance.getMessage(),
                    "The number of primary key and foreign key is different in the column " + instance.structId);
        }

        @Test
        void moreResource() {
            var instance = new StructNumDiffException(
                    UUID.randomUUID().toString(),
                    TABLE,
                    PRIMARY_KEY.getName(),
                    FOREIGN_KEY.getName(),
                    COLUMN.getName());
            assertEquals(instance.getMessage(),
                    "The number of primary key, foreign key and column is different in the table " + instance.structId);
        }
    }
}