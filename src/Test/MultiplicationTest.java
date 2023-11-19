package Test;

import Exercises.Multiplication;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {
  
  @Test
  public void testGenerateMultiplicationTableFor9() {
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

  @Test
  public void testGenerateMultiplicationTableFor5() {
    int number = 5;

    String expectedOutput = "Multiplication for 5\n" +
    "5 x 1 = 5\n" +
    "5 x 2 = 10\n" +
    "5 x 3 = 15\n" +
    "5 x 4 = 20\n" +
    "5 x 5 = 25\n" +
    "5 x 6 = 30\n" +
    "5 x 7 = 35\n" +
    "5 x 8 = 40\n" +
    "5 x 9 = 45\n" +
    "5 x 10 = 50\n" +
    "5 x 11 = 55\n" +
    "5 x 12 = 60\n";

    String actualOutput = Multiplication.generateMultiplicationTable(number);
    assertEquals(expectedOutput.trim().replace("\r",""),
    actualOutput.trim().replace("\r",""));
  }
}
