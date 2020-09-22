package com.nuxplanet.imperative;

import com.nuxplanet.common.Item;
import org.springframework.stereotype.Repository;

import static com.nuxplanet.common.Utils.random;
import static com.nuxplanet.common.Utils.sleep;

@Repository
public class ImperativeItemRepository {
    public Item getItem(int delay) {
        sleep(delay);
        return new Item(random());
    }
}
