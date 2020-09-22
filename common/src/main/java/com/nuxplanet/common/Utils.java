package com.nuxplanet.common;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Utils {
    public static void sleep(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String random() {
        return UUID.randomUUID().toString();
    }
}
