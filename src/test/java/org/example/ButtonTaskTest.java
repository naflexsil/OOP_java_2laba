package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ButtonTaskTest {
    @Test
    public void testButtonClickCount() {
        ButtonTask.Button button = new ButtonTask.Button();

        button.click();
        assertEquals(1, button.getClickCount());

        button.click();
        assertEquals(2, button.getClickCount());

        button.click();
        assertEquals(3, button.getClickCount());
    }
}