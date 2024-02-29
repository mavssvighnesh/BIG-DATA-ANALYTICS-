import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        while (true) {
            System.out.println("\n1. Add\n2. Remove\n3. Check if contains\n4. Size\n5. Display set\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    int addValue = scanner.nextInt();
                    set.add(addValue);
                    break;
                case 2:
                    System.out.print("Enter value to remove: ");
                    int removeValue = scanner.nextInt();
                    if (set.remove(removeValue)) {
                        System.out.println("Value " + removeValue + " removed from the set.");
                    } else {
                        System.out.println("Value " + removeValue + " not found in the set.");
                    }
                    break;
                case 3:
                    System.out.print("Enter value to check if contains: ");
                    int containsValue = scanner.nextInt();
                    if (set.contains(containsValue)) {
                        System.out.println("Set contains value " + containsValue);
                    } else {
                        System.out.println("Set does not contain value " + containsValue);
                    }
                    break;
                case 4:
                    System.out.println("Size of set: " + set.size());
                    break;
                case 5:
                    System.out.println("Set: " + set);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
