package id.ac.ui.cs.advprog.balance.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceTest {

    Balance balance;

    @BeforeEach
    void setUp() {
        this.balance = new Balance();
        this.balance.setBalanceId("eb558e9f-1c39-460e-8860-71af6af63bd6");
        this.balance.setBalanceAmount(50000);
    }

    @Test
    void testGetBalanceId() {
        assertEquals("eb558e9f-1c39-460e-8860-71af6af63bd6", this.balance.getBalanceId());
    }

    @Test
    void testGetBalanceAmount() {
        assertEquals(50000, this.balance.getBalanceAmount());
    }
}