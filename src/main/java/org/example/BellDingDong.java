package org.example;

public class BellDingDong {
    private boolean isDing = true;  // для отслежив-я текущ. состояния

    public void sound() {
        if (isDing) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        isDing = !isDing;
    }
}