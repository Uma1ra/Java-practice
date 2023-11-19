package Exercises;

public class Multiplication {
  public static void main(String[] args) {
    int number = 9;
    String multiplicationTable = generateMultiplicationTable(number);
    System.out.println(multiplicationTable);
  }

  public static String generateMultiplicationTable(int number) {
    StringBuilder table = new StringBuilder();

    table.append("Multiplication for ").append(number).append(System.lineSeparator());

    for (int i = 1; i <= 12; i++) {
      int result = number * i;

      table.append(String.format("%d x %d = %d%n", number, i, result));
    }

    return table.toString();
  }
}