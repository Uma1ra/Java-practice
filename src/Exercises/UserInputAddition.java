package Exercises;

import java.util.Scanner;

public class UserInputAddition {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Input the first number: ");
    int a = input.nextInt();

    System.out.print("Input the second number: ");
    int b = input.nextInt();

    int result = (a + b);

    System.out.println("The added result of a and b is: " + result);
  }
}