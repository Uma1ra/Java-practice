package MiniProjects;

import java.util.Scanner;

public class Calculator {
  private Scanner scanner;

  public Calculator() {
    this.scanner = new Scanner(System.in);
  }

  public void displayMenu() {
    System.out.println("Menu:");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Exit");
  }

  public void performOperation(int userChoice) {
    double num1 = 0, num2 = 0;
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    int userChoice;
    do {
      calculator.displayMenu();


    }

  }
}
