package com.nuxplanet.imperative;

import com.nuxplanet.common.Item;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
