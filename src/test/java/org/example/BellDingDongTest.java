package org.example;

import org.junit.jupiter.api.Test;

class BellDingDongTest {
    @Test
    public void testInitialSound() {
        BellDingDong bell = new BellDingDong();
        String output = getBellSound(bell);
    }

    @Test
    public void testAlternatingSounds() {
        BellDingDong bell = new BellDingDong();

        // ding
        String firstSound = getBellSound(bell);

        // dong
        String secondSound = getBellSound(bell);

        // ding
        String thirdSound = getBellSound(bell);
    }

    private String getBellSound(BellDingDong bell) {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        bell.sound();
        return outContent.toString().trim();
    }
}