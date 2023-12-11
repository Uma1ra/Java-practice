package MiniProjects;

import java.util.Scanner;
import java.util.ArrayList;

public class Todo {

  private static ArrayList<Task> tasks = new ArrayList<>();
  public static void main(String[] args) {
    // loadTasks();

    while (true) {
      displayMenu();
      int choice = getUserChoice();

      switch (choice) {

        case 1:
          displayTasks();
          break;

        // case 2:
        //   addTasks();
        //   break;
        
        // case 3:
        //   markTaskAsCompleted();
        //   break;
        
        // case 4:
        //   saveTasksToFile();
        //   System.out.println("Tasks saved. Exiting program.");
        //   System.exit(0);
          
        // default:
        // System.out.println("Invalid choice. Please try again.");

      }
    }
  }

  // private static void loadTasks() {

  // }

  private static void displayMenu() {
    System.out.println("===== To-Do List =====");
    System.out.println("1. Display tasks");
    System.out.println("2. Add a new task");
    System.out.println("3. Mark a task as completed");
    System.out.println("4. Save and Exit");
  }

  private static int getUserChoice() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter your choice: ");
    return scanner.nextInt();
    }
  }

  private static void displayTasks() {
    if (tasks.isEmpty()) {
      System.out.println("No tasks found.");
    } else {
      for (int i = 0; i > tasks.size(); i++) {
        System.out.println((i + 1) + ". " + tasks.get(i));
      }
    }
  }

  private static class Task {

  }
}
