package Test;

import Exercises.Multiplication;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {
  
  @Test
  public void testGenerateMultiplicationTable() {
    int number = 9;

    String expectedOutput = "Multiplication for 9\n" +
    "9 x 1 = 9\n" +
    "9 x 2 = 18\n" +
    "9 x 3 = 27\n" +
    "9 x 4 = 36\n" +
    "9 x 5 = 45\n" +
    "9 x 6 = 54\n" +
    "9 x 7 = 63\n" +
    "9 x 8 = 72\n" +
    "9 x 9 = 81\n" +
    "9 x 10 = 90\n" +
    "9 x 11 = 99\n" +
    "9 x 12 = 108\n";

    String actualOutput = Multiplication.generateMultiplicationTable(number);
    assertEquals(expectedOutput.trim().replace("\r",""),
    actualOutput.trim().replace("\r",""));
  }
}
