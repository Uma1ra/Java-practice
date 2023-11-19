package Exercises;

public class Multiplication {
  public static void main(String[] args) {
    int number = 9;
    System.out.println("Multiplication of " + number);

    for (int i = 1; i <= 12; i++) {
      int result = number * i;

      System.out.println(number + " x " + i + " = " + result);
    }
  }
}