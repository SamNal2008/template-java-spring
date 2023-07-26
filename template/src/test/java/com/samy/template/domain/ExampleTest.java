package com.samy.template.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    final Example example = new Example();

    @Test
    void function1() {
        final List<String> result = example.function1("test");
        assertEquals(1, result.size());
        assertEquals("test", result.get(0));
    }

}