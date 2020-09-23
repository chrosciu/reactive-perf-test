package com.nuxplanet.imperative;

import com.nuxplanet.common.Item;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/imperative")
@AllArgsConstructor
class ImperativeController {
    private final ImperativeItemRepository repository;

    @GetMapping("/item")
    Item getItem(@RequestParam int delay) {
        return repository.getItem(delay);
    }

    @GetMapping("/item/multiplexed")
    Item getItemMultiplexed(@RequestParam int delay) {
        Item first = repository.getItem(delay);
        Item second = repository.getItem(delay);
        return new Item(first.getValue() + second.getValue());
    }

    @GetMapping("/item/async")
    CompletableFuture<Item> getItemAsync(@RequestParam int delay) {
        return repository.getItemAsync(delay);
    }

    @GetMapping("/item/async/multiplexed")
    CompletableFuture<Item> getItemAsyncMultiplexed(@RequestParam int delay) {
        CompletableFuture<Item> first = repository.getItemAsync(delay);
        CompletableFuture<Item> second = repository.getItemAsync(delay);
        return first.thenCombine(second, (i1, i2) -> new Item(i1.getValue() + i2.getValue()));
    }
}
