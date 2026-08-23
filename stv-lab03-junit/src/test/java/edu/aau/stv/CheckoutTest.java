package edu.aau.stv;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Parts B, C and D. Testing Checkout with test doubles.
 * Complete the TODOs. Run from the project root with:  mvn test
 */
class CheckoutTest {

    // Part B. A STUB returns canned values. Here every item costs 10.
    @Test
    void total_with_a_stub_price_list() {
        PriceList stub = item -> 10;               // stub as a lambda
        Checkout checkout = new Checkout(stub);
        int total = checkout.total(List.of("pen", "book", "bag"));
        // TODO B: three items at 10 each. Replace 0 with the expected total.
        assertEquals(30, total);
    }

    // Part C. A FAKE: the in-memory price list, used as an integration test.
    @Test
    void total_with_the_in_memory_fake() {
        InMemoryPriceList prices = new InMemoryPriceList();
        prices.setPrice("pen", 5);
        prices.setPrice("book", 40);
        Checkout checkout = new Checkout(prices);
        // TODO C: assert the total of a basket containing "pen" and "book".
        assertEquals(45, checkout.total(List.of("pen", "book")));
    }

    // Part D. A SPY records how it was called so the test can inspect it.
    // Complete the assertion so the test checks priceOf was called 3 times.
    @Test
    void checkout_calls_price_list_once_per_item() {
        CountingPriceList spy = new CountingPriceList();
        Checkout checkout = new Checkout(spy);
        checkout.total(List.of("pen", "book", "bag"));
        // TODO D: assert that spy.callCount() equals the number of items.
    }

    /** A simple spy: a PriceList that counts how many times it was called. */
    static class CountingPriceList implements PriceList {
        private int calls = 0;

        @Override
        public int priceOf(String item) {
            calls++;
            return 1;   // canned price; this spy only cares about call count
        }

        public int callCount() {
            return calls;
        }
    }
}
