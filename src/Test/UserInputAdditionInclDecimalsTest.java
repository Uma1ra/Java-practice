package Test;
import Exercises.UserInputAdditionInclDecimals;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

public class UserInputAdditionInclDecimalsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testAdditionWithPositiveDecimals() {
        provideInput("3.5\n2.5\n");

        UserInputAdditionInclDecimals.main(new String[]{});

        assertEquals("Input the first number: Input the second number: The added result of a and b is: 6.0\n", outContent.toString().replace("\r",""));
    }

    @Test
    public void testAdditionWithNegativeDecimals() {
        provideInput("-1.5\n-2.5\n");

        UserInputAdditionInclDecimals.main(new String[]{});

        assertEquals("Input the first number: Input the second number: The added result of a and b is: -4.0\n", outContent.toString().replace("\r",""));
    }

    @Test
    public void testInvalidInputWithNonNumericCharacters() {
        provideInput("abc\n123\n");
        
        assertThrows(InputMismatchException.class, () -> {
          UserInputAdditionInclDecimals.main(new String[]{});
      });
    }

    private void provideInput(String data) {
      System.setIn(new java.io.ByteArrayInputStream(data.getBytes()));
    }
}
