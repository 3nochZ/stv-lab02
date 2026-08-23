package edu.aau.stv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Part A. Unit tests for Account.
 * Complete the TODOs. Run all tests from the project root with:  mvn test
 */
class AccountTest {

    @Test
    void deposit_increases_balance() {
        Account a = new Account(100);
        a.deposit(50);
        assertEquals(150, a.balance());   // done for you
    }

    @Test
    void withdraw_decreases_balance() {
        Account a = new Account(100);
        a.withdraw(40);

        assertEquals(60, a.balance());
    }

    @Test
    void withdraw_more_than_balance_throws() {
        Account a = new Account(100);

        assertThrows(IllegalStateException.class, () -> a.withdraw(1000));
    }

    @Test
    void deposit_non_positive_throws() {
        Account a = new Account(100);

        assertThrows(IllegalArgumentException.class, () -> a.deposit(0));
        assertThrows(IllegalArgumentException.class, () -> a.deposit(-10));
    }
}
