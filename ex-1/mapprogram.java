import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();

        while (true) {
            System.out
                    .println("\n1. Put\n2. Get\n3. Remove\n4. Check if contains key\n5. Size\n6. Display map\n7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    int putKey = scanner.nextInt();
                    System.out.print("Enter value: ");
                    String putValue = scanner.next();
                    map.put(putKey, putValue);
                    break;
                case 2:
                    System.out.print("Enter key to get value: ");
                    int getKey = scanner.nextInt();
                    String getValue = map.get(getKey);
                    if (getValue != null) {
                        System.out.println("Value for key " + getKey + ": " + getValue);
                    } else {
                        System.out.println("No value found for key " + getKey);
                    }
                    break;
                case 3:
                    System.out.print("Enter key to remove: ");
                    int removeKey = scanner.nextInt();
                    String removedValue = map.remove(removeKey);
                    if (removedValue != null) {
                        System.out.println("Value " + removedValue + " removed for key " + removeKey);
                    } else {
                        System.out.println("No value found for key " + removeKey);
                    }
                    break;
                case 4:
                    System.out.print("Enter key to check if contains: ");
                    int containsKey = scanner.nextInt();
                    System.out.println("Map contains key " + containsKey + ": " + map.containsKey(containsKey));
                    break;
                case 5:
                    System.out.println("Size of map: " + map.size());
                    break;
                case 6:
                    System.out.println("Map: " + map);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
