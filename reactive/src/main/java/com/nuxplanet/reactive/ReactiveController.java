package com.nuxplanet.reactive;

import com.nuxplanet.common.Item;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/reactive")
class ReactiveController {
    private final ReactiveItemRepository repository;

    @GetMapping("/item")
    Mono<Item> getItem(@RequestParam int delay) {
        return repository.getItem(delay);
    }

    @GetMapping("/item/blocking")
    Mono<Item> getItemBlocking(@RequestParam int delay) {
        return repository.getItemBlocking(delay);
    }
}
