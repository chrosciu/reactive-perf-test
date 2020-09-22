package com.nuxplanet.reactive;

import com.nuxplanet.common.Item;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.time.Duration;

import static com.nuxplanet.common.Utils.random;
import static com.nuxplanet.common.Utils.sleep;

@Repository
public class ReactiveItemRepository {
    public Mono<Item> getItem(int delay) {
        return Mono.just(new Item(random()))
                .delaySubscription(Duration.ofMillis(delay));
    }

    public Mono<Item> getItemBlocking(int delay) {
        sleep(delay);
        return Mono.just(new Item(random()));
    }
}
