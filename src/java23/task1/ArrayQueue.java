package java23.task1;

public class ArrayQueue {
    private final int SIZE;
    private final Object[] items;
    private int front, rear;

    public ArrayQueue(int SIZE) {
        this.SIZE = SIZE;
        items = new Object[SIZE];
        front = -1;
        rear = -1;
    }

    // check if the queue is full
    public boolean isFull() {
        return (front == (rear + 1) % SIZE);
    }

    // check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // insert elements to the queue
    public void enQueue(Object object) {
        // if queue is full
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            // mark from denote first element of queue
            front = 0;
        }
        rear = (rear + 1) % SIZE;
        // insert element at the rear
        items[rear] = object;
        System.out.println("Insert " + object.toString());
    }

    // delete element from the queue
    public Object deQueue() {
        // if queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        // remove element from the front of queue
        Object object = items[front];
        items[front] = null;

        // if the queue has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else {
            // mark next element as the front
            front = (front + 1) % SIZE;
        }

        System.out.println(object.toString() + " Deleted");
        return object;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            // display the front of the queue
            System.out.println("\nFront index-> " + front);
            // display element of the queue
            System.out.print("Items-> ");
            for (int i = front; i != rear; i = (i + 1) % SIZE) {
                System.out.print(items[i] + " ");
            }
            System.out.print(items[rear]);
            // display the rear of the queue
            System.out.println("\nRear index-> " + rear);
        }
    }

    public Object element() {
        if (!isEmpty()) return items[front];
        return null;
    }

    public int size() {
        if (isEmpty()) return 0;
        return rear - front + 1;
    }

    public void clear() {
        for (int i = 0; i < SIZE; i++)
            items[i] = null;
        front = -1;
        rear = -1;
    }
}
