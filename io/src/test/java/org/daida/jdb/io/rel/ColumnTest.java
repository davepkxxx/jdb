package org.daida.jdb.io.rel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ColumnTest {
    Column instance;

    @BeforeEach
    void setUp() {
        instance = new Column(UUID.randomUUID().toString());
    }

    @Test
    void getStructType() {
        assertEquals(instance.getStructType(), StructType.COLUMN);
    }

    @Nested
    class InitTest {
        DbStruct param;

        @BeforeEach
        void setUp() {
            param = new DbStruct();
        }

        @Nested
        class InitTableTest {
            @BeforeEach
            void setUp() {
                instance.setTableId(UUID.randomUUID().toString());
            }

            @Test()
            void init() {
                param.setTables(new ArrayList<>() {{
                    add(new Table(instance.getTableId()));
                }});
                assertDoesNotThrow(() -> instance.init(param));
                assertNotNull(instance.getTable());
                assertEquals(instance.getTable().getId(), instance.getTableId());
            }

            @Test()
            void notFound() {
                var err = assertThrows(StructNotFoundException.class, () -> instance.init(param));
                assertEquals(err.getMessage(), String.format(
                        "The table %s was not found in the column %s",
                        instance.getTableId(),
                        instance.getId()));
            }
        }

        @Nested
        class InitPrimaryKeyTest {
            @BeforeEach
            void setUp() {
                instance.setPrimaryKeyId(UUID.randomUUID().toString());
            }

            @Test()
            void init() {
                param.setPrimaryKeys(new ArrayList<>() {{
                    add(new PrimaryKey(instance.getPrimaryKeyId()));
                }});
                assertDoesNotThrow(() -> instance.init(param));
                assertNotNull(instance.getPrimaryKey());
                assertEquals(instance.getPrimaryKey().getId(), instance.getPrimaryKeyId());
            }

            @Test()
            void notFound() {
                var err = assertThrows(StructNotFoundException.class, () -> instance.init(param));
                assertEquals(err.getMessage(), String.format(
                        "The primary key %s was not found in the column %s",
                        instance.getPrimaryKeyId(),
                        instance.getId()));
            }
        }

        @Nested
        class InitForeignKeysTest {
            @BeforeEach
            void setUp() {
                instance.setForeignKeyIds(new ArrayList<>() {{
                    add(UUID.randomUUID().toString());
                }});
            }

            @Test()
            void init() {
                param.setForeignKeys(new ArrayList<>() {{
                    add(new ForeignKey(instance.getForeignKeyIds().get(0)));
                }});
                assertDoesNotThrow(() -> instance.init(param));
                assertNotNull(instance.getForeignKeys());
                assertEquals(instance.getForeignKeys().size(), instance.getForeignKeyIds().size());
                assertTrue(param.getForeignKeys().contains(instance.getForeignKeys().get(0)));
                assertEquals(instance.getForeignKeys().get(0).getId(), instance.getForeignKeyIds().get(0));
            }

            @Test()
            void notFound() {
                var err = assertThrows(StructNotFoundException.class, () -> instance.init(param));
                assertEquals(err.getMessage(), String.format(
                        "The foreign key %s was not found in the column %s",
                        instance.getForeignKeyIds().get(0),
                        instance.getId()));
            }
        }
    }
}