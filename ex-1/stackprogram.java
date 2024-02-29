import java.util.Scanner;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

public class stackprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Check if stack is empty\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int pushValue = scanner.nextInt();
                    stack.push(pushValue);
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1)
                        System.out.println("Popped value: " + poppedValue);
                    break;
                case 3:
                    int peekedValue = stack.peek();
                    if (peekedValue != -1)
                        System.out.println("Top value: " + peekedValue);
                    break;
                case 4:
                    System.out.println("Is stack empty? " + stack.isEmpty());
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
