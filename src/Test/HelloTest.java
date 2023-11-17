package Test;

import Main.Hello;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class HelloTest {

    @Test
    public void testPrintLines() {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        Hello.main(new String[]{});

        // Assert
        String consoleOutput = outContent.toString();
        assertTrue("Console output should contain 'Hello World!'", consoleOutput.contains("Hello World!"));
    }
}