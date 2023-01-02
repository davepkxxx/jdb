package org.daida.jdb.test.mock;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

public abstract class AbstractMocked {
    protected AutoCloseable mocksOpened;

    @BeforeEach
    protected void setUp() {
        mocksOpened = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
        mocksOpened.close();
    }
}
