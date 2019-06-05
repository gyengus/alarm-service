package hu.gyengus.smarthome.alarm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Tests for App class.
 */
@SpringBootTest
public class AppTests {

    /**
     * Check hu.gyengus.smarthome.alarm.App is exists.
     */
    @Test
    public void testAppClassIsExists() {
        assertEquals("hu.gyengus.smarthome.alarm.App", App.class.getName());
    }

    /**
     * Testing main method.
     */
    @Test
    public void testMain() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        App.main(new String[0]);
        assertEquals("Hello from alarm-service" + System.lineSeparator(), outContent.toString());
    }

}
