package org.example;

import java.util.Scanner;

public class Table {
    private int[][] table;
    private int rows;
    private int cols;

    public Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        table = new int[rows][cols];
    }

    public int getValue(int row, int col) {
        return table[row][col];
    }

   // значе-е в строке и в столбце таблицы
    public void setValue(int row, int col, int value) {
        table[row][col] = value;
    }

    // кол-во строк
    public int rows() {
        return rows;
    }
    // кол-во столбцов
    public int cols() {
        return cols;
    }


    // аннотация - переопределение. toString() переопр. стандартный метод toString() класса Object.
    // Кажд. класс наслед. от класса Object, и у всех классов есть метод toString(), к-ый по умолч. возвращ.
    // строковое представл-е объекта

    // преобразование двумерн. массива в строку
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                builder.append(table[i][j]).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

   // поиск ср. знач-я в табл.
    public double average() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                sum += table[i][j];
                ++count;
            }
        }
        return (double) sum / count;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("enter number of columns: ");
        cols = scanner.nextInt();
        table = new int[rows][cols];

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                System.out.println("enter value for cell (" + i + ", " + j + "): ");
                int value = scanner.nextInt();
                setValue(i, j, value);
            }
        }

        System.out.println("table:\n" + toString());
        System.out.println("average value: " + average());
    }
}

