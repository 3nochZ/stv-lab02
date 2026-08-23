package edu.aau.stv;

/**
 * A source of item prices. This is a collaborator of {@link Checkout}.
 * In the lab you replace it with test doubles: a stub, a fake and a spy.
 */
public interface PriceList {

    /** Return the price of an item, or throw if the item is unknown. */
    int priceOf(String item);
}
