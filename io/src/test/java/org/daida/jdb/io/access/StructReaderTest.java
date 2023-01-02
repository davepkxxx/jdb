package org.daida.jdb.io.access;

import org.daida.jdb.io.rel.DbStruct;
import org.daida.jdb.lang.reflect.Fields;
import org.daida.jdb.test.mock.AbstractMocked;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

class StructReaderTest {
    @Nested
    class ReadTest {
        StructReader instance;

        @AfterEach
        void tearDown() throws IOException {
            instance.close();
        }

        @Test
        void read() {
            instance = new StructReader(new StringReader("""
                    --- {}
                    """));
            assertDoesNotThrow(instance::read);
        }

        @Test
        void tables() {
            instance = new StructReader(new StringReader("""
                    ---
                    tables:
                    - id: "a136dc36-5ab7-4d5a-a2a2-138965a3bb13"
                      name: "a05369af"
                      columnIds:
                      - "9ad27573-f0bb-4610-94b2-8ffcc910454b"
                    - id: "293b0a54-a841-52c0-799d-3653bec4eb84"
                      name: "ea8ce22b"
                      columnIds:
                      - "9b243402-3da2-a553-3dff-5d16eb12c8b3"
                      - "158c9449-4930-3c06-7c06-a1dae51e3114"
                      primaryKeyId: "41afb83a-429d-c8b8-7e3c-d4a196f58db1"
                      foreignKeyIds:
                      - "16f8583e-1005-bbdc-751f-a5c7fea9f43a"
                      - "c0c9fa64-d4b4-eee0-ddf8-e911cb52179a"
                    """));
            var res = assertDoesNotThrow(instance::read);
            assertEquals(res.getTables().size(), 2);
            var el = res.getTables().get(0);
            assertEquals(el.getId(), "a136dc36-5ab7-4d5a-a2a2-138965a3bb13");
            assertEquals(el.getName(), "a05369af");
            assertEquals(el.getColumnIds().size(), 1);
            assertEquals(el.getColumnIds().get(0), "9ad27573-f0bb-4610-94b2-8ffcc910454b");
            el = res.getTables().get(1);
            assertEquals(el.getId(), "293b0a54-a841-52c0-799d-3653bec4eb84");
            assertEquals(el.getName(), "ea8ce22b");
            assertEquals(el.getColumnIds().size(), 2);
            assertEquals(el.getColumnIds().get(0), "9b243402-3da2-a553-3dff-5d16eb12c8b3");
            assertEquals(el.getColumnIds().get(1), "158c9449-4930-3c06-7c06-a1dae51e3114");
            assertEquals(el.getPrimaryKeyId(), "41afb83a-429d-c8b8-7e3c-d4a196f58db1");
            assertEquals(el.getForeignKeyIds().size(), 2);
            assertEquals(el.getForeignKeyIds().get(0), "16f8583e-1005-bbdc-751f-a5c7fea9f43a");
            assertEquals(el.getForeignKeyIds().get(1), "c0c9fa64-d4b4-eee0-ddf8-e911cb52179a");
        }

        @Test
        void columns() {
            instance = new StructReader(new StringReader("""
                    ---
                    columns:
                    - id: "96f39f96-637c-adf1-7411-1065327d2eaf"
                      name: "cc33ef23"
                      dataType: "CHAR"
                      dataLength: 98
                      notNull: false
                      tableId: "bff53106-006a-1834-a2c5-65b97119e02e"
                    - id: "48728e38-1c7d-f9bf-e98a-eb3752d554be"
                      name: "bcc230a6"
                      dataType: "NUMERIC"
                      dataLength: 7
                      dataPrecision: 1
                      notNull: true
                      tableId: "0e1ed768-722b-8475-5844-eb879f26c7be"
                      primaryKeyId: "452d9fe5-781d-6ccf-45ad-767a83709d89"
                      foreignKeyIds:
                      - "4341bdb0-09a2-315f-6862-4b0185b51a55"
                      - "1dc0bd5d-6dc0-f08a-4a6a-06dd5d065887"
                    """));
            var res = assertDoesNotThrow(instance::read);
            assertEquals(res.getColumns().size(), 2);
            var el = res.getColumns().get(0);
            assertEquals(el.getId(), "96f39f96-637c-adf1-7411-1065327d2eaf");
            assertEquals(el.getName(), "cc33ef23");
            assertEquals(el.getDataType(), "CHAR");
            assertEquals(el.getDataLength(), 98);
            assertFalse(el.getNotNull());
            assertEquals(el.getTableId(), "bff53106-006a-1834-a2c5-65b97119e02e");
            el = res.getColumns().get(1);
            assertEquals(el.getId(), "48728e38-1c7d-f9bf-e98a-eb3752d554be");
            assertEquals(el.getName(), "bcc230a6");
            assertEquals(el.getDataType(), "NUMERIC");
            assertEquals(el.getDataLength(), 7);
            assertEquals(el.getDataPrecision(), 1);
            assertTrue(el.getNotNull());
            assertEquals(el.getTableId(), "0e1ed768-722b-8475-5844-eb879f26c7be");
            assertEquals(el.getPrimaryKeyId(), "452d9fe5-781d-6ccf-45ad-767a83709d89");
            assertEquals(el.getForeignKeyIds().size(), 2);
            assertEquals(el.getForeignKeyIds().get(0), "4341bdb0-09a2-315f-6862-4b0185b51a55");
            assertEquals(el.getForeignKeyIds().get(1), "1dc0bd5d-6dc0-f08a-4a6a-06dd5d065887");
        }

        @Test
        void primaryKey() {
            instance = new StructReader(new StringReader("""
                    ---
                    primaryKeys:
                    - id: "87d21b0c-95d6-39b7-f823-adf184326246"
                      name: "f8df343b"
                      tableId: "513b01e0-2409-c819-a4cd-3c8c135f9104"
                      columnIds:
                      - "9afa954e-7151-92f0-eda2-31e5be7c96ec"
                      - "94a010ce-9cb5-dcf6-705b-11e076ceb1de"
                    """));
            var res = assertDoesNotThrow(instance::read);
            assertEquals(res.getPrimaryKeys().size(), 1);
            var el = res.getPrimaryKeys().get(0);
            assertEquals(el.getId(), "87d21b0c-95d6-39b7-f823-adf184326246");
            assertEquals(el.getName(), "f8df343b");
            assertEquals(el.getTableId(), "513b01e0-2409-c819-a4cd-3c8c135f9104");
            assertEquals(el.getColumnIds().size(), 2);
            assertEquals(el.getColumnIds().get(0), "9afa954e-7151-92f0-eda2-31e5be7c96ec");
            assertEquals(el.getColumnIds().get(1), "94a010ce-9cb5-dcf6-705b-11e076ceb1de");
        }

        @Test
        void foreignKey() {
            instance = new StructReader(new StringReader("""
                    foreignKeys:
                    - id: "0b874a05-fa91-a0c9-926a-25be43d702b5"
                      name: "a4f414e8"
                      tableId: "8bcc1471-921a-723e-909c-89c6ca5f1f13"
                      referenceTableId: "4ec881c9-5647-f7cc-4234-3389b49f997b"
                      columnIds:
                      - "d9b3139d-4a56-bc85-8e7b-36ac69b9c0a9"
                      - "288d389d-0240-7f56-bb86-04b84bb6f44d"
                      referenceColumnIds:
                      - "7e0d00a8-5a2d-6b49-069c-9d94448d84a8"
                      - "91f5a429-f597-baad-4c18-f026b05407f9"
                    """));
            var res = assertDoesNotThrow(instance::read);
            assertEquals(res.getForeignKeys().size(), 1);
            var el = res.getForeignKeys().get(0);
            assertEquals(el.getId(), "0b874a05-fa91-a0c9-926a-25be43d702b5");
            assertEquals(el.getName(), "a4f414e8");
            assertEquals(el.getTableId(), "8bcc1471-921a-723e-909c-89c6ca5f1f13");
            assertEquals(el.getReferenceTableId(), "4ec881c9-5647-f7cc-4234-3389b49f997b");
            assertEquals(el.getColumnIds().size(), 2);
            assertEquals(el.getColumnIds().get(0), "d9b3139d-4a56-bc85-8e7b-36ac69b9c0a9");
            assertEquals(el.getColumnIds().get(1), "288d389d-0240-7f56-bb86-04b84bb6f44d");
            assertEquals(el.getReferenceColumnIds().size(), 2);
            assertEquals(el.getReferenceColumnIds().get(0), "7e0d00a8-5a2d-6b49-069c-9d94448d84a8");
            assertEquals(el.getReferenceColumnIds().get(1), "91f5a429-f597-baad-4c18-f026b05407f9");
        }
    }

    @Nested
    class CloseTest extends AbstractMocked {
        @Mock
        Reader mocked;

        StructReader instance;

        @BeforeEach
        public void setUp() {
            super.setUp();
            this.instance = new StructReader(mocked);
        }

        @Test
        void close() throws IOException {
            assertDoesNotThrow(() -> instance.close());
            verify(mocked).close();
        }

        @Test
        void throwIOException() throws IOException {
            doThrow(IOException.class).when(mocked).close();
            assertThrows(IOException.class, () -> instance.close());
        }
    }
}