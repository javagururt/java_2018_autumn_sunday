package com.javaguru.lessons.lesson9;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

class HashMapTest {

    public static void main(String[] args) {
        Map<ProductKey, String> products = new HashMap<>();

        ProductKey firstAppleKey = new ProductKey("Apple", new BigDecimal("10"));
        ProductKey secondAppleKey = new ProductKey("Apple", new BigDecimal("10"));
        products.put(firstAppleKey, "With love from Latvia!");
        products.put(new ProductKey("Banana", BigDecimal.TEN), "With love from Africa!");
        System.out.println(products);

        String appleDescription = products.get(secondAppleKey);

        System.out.println(appleDescription);
    }
}
