package org.daida.jdb.io.rel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PrimaryKeyTest {
    PrimaryKey instance;

    @BeforeEach
    void setUp() {
        instance = new PrimaryKey(UUID.randomUUID().toString());
    }

    @Test
    void getStructType() {
        assertEquals(instance.getStructType(), StructType.PRIMARY_KEY);
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
                        "The table %s was not found in the primary key %s",
                        instance.getTableId(),
                        instance.getId()));
            }
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
                        "The column %s was not found in the primary key %s",
                        instance.getColumnIds().get(0),
                        instance.getId()));
            }
        }
    }
}