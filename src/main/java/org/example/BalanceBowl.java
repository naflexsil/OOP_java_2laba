package org.example;
import java.util.Scanner;

public class BalanceBowl {
    private int leftWeight = 0;
    private int rightWeight = 0;

    public void addLeft(int weight) {
        leftWeight += weight;
    }
    public void addRight(int weight) {
        rightWeight += weight;
    }

    public String result() {
        if (leftWeight == rightWeight) {
            return "=";
        } else if (leftWeight > rightWeight) {
            return "L";
        } else {
            return "R";
        }
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        BalanceBowl balance = new BalanceBowl();

        System.out.print("weight for the left bowl: ");
        while (!scanner.hasNextInt()) {
            System.out.println("error! enter an integer");
            scanner.next();
        }
        int left = scanner.nextInt();
        balance.addLeft(left);

        System.out.print("weight for the right bowl: ");
        while (!scanner.hasNextInt()) {
            System.out.println("error! enter an integer");
            scanner.next();
        }
        int right = scanner.nextInt();
        balance.addRight(right);

        System.out.println("result: " + balance.result());
    }
}