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

    // TODO A1: withdraw_decreases_balance
    //   withdraw 40 from an account of 100 should leave 60.

    // TODO A2: withdraw_more_than_balance_throws
    //   assertThrows(IllegalStateException.class, () -> a.withdraw(1000));

    // TODO A3: deposit_non_positive_throws
    //   a deposit of 0 or a negative amount should throw IllegalArgumentException.
}
