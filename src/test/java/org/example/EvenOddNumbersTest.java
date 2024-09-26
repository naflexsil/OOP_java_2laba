package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddNumbersTest {
    @Test
    public void testAddNumber() {
        EvenOddNumbers evenOddNumbers = new EvenOddNumbers();

        evenOddNumbers.addNumber(2);
        evenOddNumbers.addNumber(5);
        evenOddNumbers.addNumber(8);
        evenOddNumbers.addNumber(7);
        evenOddNumbers.addNumber(10);
        evenOddNumbers.addNumber(13);

        List<Integer> evenNumbers = evenOddNumbers.getEvenNumbers();
        assertEquals(3, evenNumbers.size());
        assertTrue(evenNumbers.contains(2));
        assertTrue(evenNumbers.contains(8));
        assertTrue(evenNumbers.contains(10));

        List<Integer> oddNumbers = evenOddNumbers.getOddNumbers();
        assertEquals(3, oddNumbers.size());
        assertTrue(oddNumbers.contains(5));
        assertTrue(oddNumbers.contains(7));
        assertTrue(oddNumbers.contains(13));
    }
}