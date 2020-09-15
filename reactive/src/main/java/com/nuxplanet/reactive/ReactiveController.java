package com.nuxplanet.reactive;

import com.nuxplanet.common.Item;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/reactive")
class ReactiveController {
    private final ReactiveItemRepository repository;

    @GetMapping("/item")
    Mono<Item> getItem() {
        return repository.getItem(0);
    }

    @GetMapping("/item/blocking")
    Mono<Item> getItemBlocking() {
        return repository.getItemBlocking(0);
    }
}
