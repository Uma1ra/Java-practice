package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputAdditionInclDecimals {
  private static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {

    try {
      System.out.print("Input the first number: ");
      double a = input.nextDouble();

      System.out.print("Input the second number: ");
      double b = input.nextDouble();

      double result = (a + b);

      System.out.println("The added result of a and b is: " + result);
    } catch (InputMismatchException e) {
      System.out.println("Invalid input. Please enter valid integers.");
    } finally {
      input.close();
    }
    
  }
}
