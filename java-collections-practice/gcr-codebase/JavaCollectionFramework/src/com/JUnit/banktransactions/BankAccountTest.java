package com.JUnit.banktransactions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000.0);
    }

    // deposit
    @Test
    void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    // Test withdraw
    @Test
    void testWithdraw() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }

    // Test insufficient funds
    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalStateException.class,() -> account.withdraw(2000.0));

        assertEquals("Insufficient funds", exception.getMessage());
    }

    // Test negative deposit
    @Test
    void testNegativeDeposit() {
        assertThrows( IllegalArgumentException.class,() -> account.deposit(-100) );
    }

    // Test negative withdraw
    @Test
    void testNegativeWithdraw() {
        assertThrows( IllegalArgumentException.class, () -> account.withdraw(-50) );
    }
}