package edu.aau.stv;

import java.util.HashMap;
import java.util.Map;

/**
 * A lightweight, in-memory {@link PriceList}. This is a FAKE: a real but
 * simplified implementation, used as a test double in integration tests.
 */
public class InMemoryPriceList implements PriceList {

    private final Map<String, Integer> prices = new HashMap<>();

    public void setPrice(String item, int price) {
        prices.put(item, price);
    }

    @Override
    public int priceOf(String item) {
        Integer price = prices.get(item);
        if (price == null) {
            throw new IllegalArgumentException("unknown item: " + item);
        }
        return price;
    }
}
