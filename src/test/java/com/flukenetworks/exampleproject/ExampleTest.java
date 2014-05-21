package com.flukenetworks.exampleproject;


import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class ExampleTest {

    @Test
    public void testGetValue() throws Exception {
        Example ex = new Example(19);
        assertThat(ex.getValue()).isEqualTo(19);
    }
}