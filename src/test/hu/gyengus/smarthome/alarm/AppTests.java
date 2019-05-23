package hu.gyengus.smarthome.alarm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class AppTests {

    @Test
    void testAppClassIsExists() {
        assertEquals("hu.gyengus.smarthome.alarm.App", App.class.getName());
    }

    @Test
    void testAppClass() {
        App app = new App();
        assertEquals("hu.gyengus.smarthome.alarm.App", app.getClass().getName());
    }

    @Test
    void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        App.main(null);
        assertEquals("Hello from alarm-service" + System.lineSeparator(), outContent.toString());
    }

}
