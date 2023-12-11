package MiniProjects;

public class Todo {
  public static void main(String[] args) {
    // loadTasks();

    while (true) {
      displayMenu();
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
}
