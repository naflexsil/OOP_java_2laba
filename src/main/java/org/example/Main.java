package org.example;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        button.click();
        button.click();
        button.click();

        System.out.println("all click: " + button.getClickCount());
    }

    public static class Button {
        private int clickCount = 0;

        public void click() {
            ++clickCount;
            System.out.println("count click: " + clickCount);
        }

        public int getClickCount() {
            return clickCount;
        }
    }
}


