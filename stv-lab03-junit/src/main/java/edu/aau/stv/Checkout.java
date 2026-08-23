package edu.aau.stv;

import java.util.List;

/** Computes the total price of a basket using a {@link PriceList}. */
public class Checkout {

    private final PriceList priceList;

    public Checkout(PriceList priceList) {
        this.priceList = priceList;
    }

    /** Sum the price of every item in the basket. */
    public int total(List<String> items) {
        int sum = 0;
        for (String item : items) {
            sum += priceList.priceOf(item);
        }
        return sum;
    }
}
