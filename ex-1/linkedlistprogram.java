import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    // Insertion at the end of the list
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Deletion of a node with a given value
    void delete(int data) {
        if (head == null)
            return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Element not found");
            return;
        }
        temp.next = temp.next.next;
    }

    // Search for a given value
    boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // Display the elements of the list
    void display() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class linkedlistprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true) {
            System.out.println("\n1. Insert\n2. Delete\n3. Search\n4. Display\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    list.insert(insertValue);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();
                    list.delete(deleteValue);
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    int searchValue = scanner.nextInt();
                    boolean found = list.search(searchValue);
                    System.out.println(
                            "Value " + searchValue + " is " + (found ? "present" : "not present") + " in the list.");
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
