package Test;

import Exercises.Multiplication;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {
  
  @Test
  public void testCorrectMultiplication() {
    int number = 5;

    int[] expectedResults = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};

    for (int i = 1; i <= 12; i++) {
      assertEquals(expectedResults[i - 1], Multiplication.main(number, i));
    }
  }

}
