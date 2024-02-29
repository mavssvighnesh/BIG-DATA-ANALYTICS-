import java.util.Scanner;

class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int value) {
        if (currentSize == maxSize) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int dequeuedValue = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return dequeuedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }
}

public class queueprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        Queue queue = new Queue(size);

        while (true) {
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Peek\n4. Check if queue is empty\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int enqueueValue = scanner.nextInt();
                    queue.enqueue(enqueueValue);
                    break;
                case 2:
                    int dequeuedValue = queue.dequeue();
                    if (dequeuedValue != -1)
                        System.out.println("Dequeued value: " + dequeuedValue);
                    break;
                case 3:
                    int peekedValue = queue.peek();
                    if (peekedValue != -1)
                        System.out.println("Front value: " + peekedValue);
                    break;
                case 4:
                    System.out.println("Is queue empty? " + queue.isEmpty());
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
