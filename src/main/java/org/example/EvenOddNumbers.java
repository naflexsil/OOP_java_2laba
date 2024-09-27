package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOddNumbers {
    private final List<Integer> evenNumbers = new ArrayList<>();
    private final List<Integer> oddNumbers = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    public void printEven() {
        System.out.println("even numbers: " + evenNumbers);
    }
    public void printOdd() {
        System.out.println("odd numbers: " + oddNumbers);
    }
    public List<Integer> getEvenNumbers() {
        return evenNumbers;
    }
    public List<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter 6 numbers:");
        for (int i = 0; i < 6; ++i) {
            System.out.print("enter number " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("invalid input!!!!!!!! enter an integer!!!!!!!!!!");
                scanner.next();
            }
            int number = scanner.nextInt();
            addNumber(number);
        }

        printEven();    // чет
        printOdd();     // нечет
    }
}
