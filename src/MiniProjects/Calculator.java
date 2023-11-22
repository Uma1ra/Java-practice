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
}
