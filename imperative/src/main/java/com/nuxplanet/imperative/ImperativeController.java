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
}
