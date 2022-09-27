package org.daida.jdb.syntax.err;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SyntaxExceptionTest {

    @Test
    void newExceptedInstance() {
        var ex = SyntaxException.newExceptedInstance("fdcd6257", 3);
        assertEquals(ex.getMessage(), "excepted 'd'");
    }
}