package org.daida.jdb.io.rel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {
    private Table instance;

    @BeforeEach
    void setUp() {
        instance = new Table(UUID.randomUUID().toString());
    }

    @Test
    void getStructType() {
        assertEquals(instance.getStructType(), StructType.TABLE);
    }

    @Nested
    class InitTest {
        DbStruct param;

        @BeforeEach
        void setUp() {
            param = new DbStruct();
        }

        @Nested
        class InitColumnsTest {
            @BeforeEach
            void setUp() {
                instance.setColumnIds(new ArrayList<>() {{
                    add(UUID.randomUUID().toString());
                }});
            }

            @Test()
            void init() {
                param.setColumns(new ArrayList<>() {{
                    add(new Column(instance.getColumnIds().get(0)));
                }});
                assertDoesNotThrow(() -> instance.init(param));
                assertNotNull(instance.getColumns());
                assertEquals(instance.getColumns().size(), instance.getColumnIds().size());
                assertTrue(param.getColumns().contains(instance.getColumns().get(0)));
                assertEquals(instance.getColumns().get(0).getId(), instance.getColumnIds().get(0));
            }

            @Test()
            void notFound() {
                var err = assertThrows(StructNotFoundException.class, () -> instance.init(param));
                assertEquals(err.getMessage(), String.format(
                        "The column %s was not found in the table %s",
                        instance.getColumnIds().get(0),
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
                        "The primary key %s was not found in the table %s",
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
                        "The foreign key %s was not found in the table %s",
                        instance.getForeignKeyIds().get(0),
                        instance.getId()));
            }
        }
    }
}