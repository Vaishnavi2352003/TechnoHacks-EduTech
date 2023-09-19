import java.util.ArrayList;
import java.util.Scanner;

public class Task_4 {
    private ArrayList<String> todoList;

    public Task_4() {
        todoList = new ArrayList<>();
    }

    public void addItem(String item) {
        todoList.add(item);
        System.out.println("Item added to the to-do list.");
    }

    public void removeItem(String item) {
        if (todoList.remove(item)) {
            System.out.println("Item removed from the to-do list.");
        } else {
            System.out.println("Item not found in the to-do list.");
        }
    }

    public void viewList() {
        System.out.println("To-Do List:");
        for (String item : todoList) {
            System.out.println("- " + item);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task_4 todoList = new Task_4();

        boolean running = true;
        while (running) {
            System.out.println("Select an option:\n1. Add Item\n2. Remove Item\n3. View List\n4. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String addItem = scanner.nextLine();
                    todoList.addItem(addItem);
                    break;
                case 2:
                    System.out.print("Enter the item to remove: ");
                    String removeItem = scanner.nextLine();
                    todoList.removeItem(removeItem);
                    break;
                case 3:
                    todoList.viewList();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
