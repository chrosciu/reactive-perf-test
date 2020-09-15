package com.nuxplanet.reactive;

import com.nuxplanet.common.Item;
import org.junit.Before;
import org.junit.Test;
import reactor.test.StepVerifier;

public class ReactiveItemRepositoryTest {
    private ReactiveItemRepository repository;

    @Before
    public void setup() {
        repository = new ReactiveItemRepository();
    }

    @Test
    public void shouldGetItem() {
        StepVerifier.create(repository.getItem(0))
                .expectSubscription()
                .expectNext(new Item("Hello world"))
                .expectComplete()
                .verify();
    }

    @Test
    public void shouldGetItemBlocking() {
        StepVerifier.create(repository.getItemBlocking(0))
                .expectSubscription()
                .expectNext(new Item("Hello world"))
                .expectComplete()
                .verify();
    }
}