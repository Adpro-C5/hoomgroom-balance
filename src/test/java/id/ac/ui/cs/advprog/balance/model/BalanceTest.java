package id.ac.ui.cs.advprog.balance.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceTest {

    Balance balance;

    @BeforeEach
    void setUp() {
        this.balance = new Balance();
        this.balance.setId(UUID.fromString("eb558e9f-1c39-460e-8860-71af6af63bd6"));
        this.balance.setAmount(50000.0);
    }

    @Test
    void testGetBalanceId() {
        assertEquals(UUID.fromString("eb558e9f-1c39-460e-8860-71af6af63bd6"), this.balance.getId());
    }

    @Test
    void testGetBalanceAmount() {
        assertEquals(50000, this.balance.getAmount());
    }
}