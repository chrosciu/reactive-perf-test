package com.nuxplanet.imperative;

import com.nuxplanet.common.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.concurrent.CompletableFuture;

import static com.nuxplanet.common.Utils.random;
import static com.nuxplanet.common.Utils.sleep;

@Repository
@RequiredArgsConstructor
public class ImperativeItemRepository {
    private final TaskScheduler taskScheduler;

    public Item getItem(int delay) {
        sleep(delay);
        return new Item(random());
    }

    public CompletableFuture<Item> getItemAsync(int delay) {
        CompletableFuture<Item> completableFuture = new CompletableFuture<>();
        taskScheduler.schedule(() -> {
            Item item = new Item(random());
            completableFuture.complete(item);
        }, Instant.now().plusMillis(delay));
        return completableFuture;
    }

    //TODO - Separate simulation for this
    @Async("threadPoolTaskExecutor")
    public CompletableFuture<Item> getItemAsyncBlocking(int delay) {
        sleep(delay);
        Item item = new Item(random());
        return CompletableFuture.completedFuture(item);
    }
}
