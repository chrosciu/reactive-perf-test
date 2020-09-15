package com.nuxplanet.common;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ItemTest {
    @Test
    public void shouldBeEqualToOtherItemWithTheSameValue() {
        //given
        Item item1 = new Item("Hello World");
        Item item2 = new Item("Hello World");

        //when
        //then
        assertEquals(item1, item2);
    }

    @Test
    public void shouldnotBeEqualToOtherItemWithDifferentValue() {
        //given
        Item item1 = new Item("Hello World");
        Item item2 = new Item("Hello");

        //when
        //then
        assertNotEquals(item1, item2);
    }
}
