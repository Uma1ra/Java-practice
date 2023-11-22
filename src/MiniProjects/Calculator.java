package MiniProjects;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

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

  private static double readDouble(Scanner scanner) {
    while (true) {
      try {
        return scanner.nextDouble();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a valid number.");
        scanner.nextLine(); // Consume the invalid input
      } catch (NoSuchElementException e) {
        System.out.println("No more input available.");
        throw e;
      }
    }
  }

  public void performOperation(int userChoice) {
    double num1 = 0, num2 = 0;

    try {
      if (userChoice >= 1 && userChoice <= 4) {
        System.out.println("Enter the first number: ");
        num1 = readDouble(scanner);

        System.out.println("Enter the second number: ");
        num2 = readDouble(scanner);
      }
    } catch (InputMismatchException e) {
      System.out.println("Invalid input. Please enter valid numbers.");
      scanner.nextLine();
    }

    switch (userChoice) {
      case 1:
        System.out.println("Result: " + (num1 + num2));
        break;

      case 2:
        System.out.println("Result: " + (num1 - num2));
        break;

      case 3:
        System.out.println("Result: " + (num1 * num2));
        break;

      case 4:
        while (num2 == 0) {
          System.out.println("Enter the second number: ");
          num2 = readDouble(scanner);
        }
        System.out.println("Result: " + (num1 / num2));
        break;

      case 5:
        System.out.println("Exiting program...");
        break;

      default:
        System.out.println("Invalid choice.");
    }
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    int userChoice;
    do {
      try {
        calculator.displayMenu();

        System.out.println("Enter your choice: ");
        userChoice = calculator.scanner.nextInt();

        if (userChoice >= 1 && userChoice <= 5) {
          calculator.performOperation(userChoice);
        } else { 
          System.out.println("Invalid choice. Please try again."); //メニュー外の整数のエラー
        }
      } catch (InputMismatchException e) { //整数以外の入力で例外処理
        System.out.println("Invalid input. Please enter a valid integer.");
        calculator.scanner.nextLine();
        userChoice = 0; //無限ループを防ぐため
      }

    } while (userChoice !=5); //5 = Exitなため

    calculator.scanner.close();

  }
}