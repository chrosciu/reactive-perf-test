package com.nuxplanet.imperative;


import com.nuxplanet.common.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImperativeItemRepositoryTest {
    private ImperativeItemRepository repository;

    @Before
    public void setup() {
        repository = new ImperativeItemRepository();
    }

    @Test
    public void shouldGetItem() {
        assertEquals(repository.getItem(0), new Item("Hello world"));
    }
}