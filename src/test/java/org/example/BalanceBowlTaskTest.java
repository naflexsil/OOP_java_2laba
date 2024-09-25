package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BalanceBowlTaskTest {
    @Test
    public void testEqualWeight() {
        BalanceBowl balance = new BalanceBowl();

        balance.addLeft(5);
        balance.addRight(5);
        assertEquals("=", balance.result());
    }

    @Test
    public void testLeftHeavier() {
        BalanceBowl balance = new BalanceBowl();

        balance.addLeft(10);
        balance.addRight(5);
        assertEquals("L", balance.result());
    }

    @Test
    public void testRightHeavier() {
        BalanceBowl balance = new BalanceBowl();

        balance.addLeft(5);
        balance.addRight(10);
        assertEquals("R", balance.result());
    }
}