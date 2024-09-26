package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("choose task (1-6):");
        System.out.println("1 - Button");
        System.out.println("2 - Balance Bowl");
        System.out.println("3 - Bell Ding-Dong");
        System.out.println("4 - EvenOddNumbers");
        System.out.println("5 - EvenOddNumbers");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                new ButtonTask().execute();
                break;
            case 2:
                new BalanceBowl().execute();
                break;
            case 3:
                BellDingDong bell = new BellDingDong();
                bell.sound();   // ding
                bell.sound();   // dong
                bell.sound();
                bell.sound();
                break;
            case 4:
                EvenOddNumbers evenOddTask = new EvenOddNumbers();
                evenOddTask.execute();
                break;
            default:
                System.out.println("invalid choice!!!!!!!!!!!");
        }
    }
}