package java23.task1;

public abstract class ArrayQueueADT {
    private final int SIZE;
    private final Object[] items;
    private int front, rear;

    public ArrayQueueADT(int SIZE) {
        this.SIZE = SIZE;
        items = new Object[SIZE];
        front = -1;
        rear = -1;
    }

    // check if the queue is full
    public static boolean isFull(ArrayQueueADT queue) {
        return (queue.front == (queue.rear + 1) % queue.SIZE);
    }

    // check if the queue is empty
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.front == -1;
    }

    // insert elements to the queue
    public static void enQueue(ArrayQueueADT queue, Object object) {
        // if queue is full
        if (isFull(queue)) {
            System.out.println("Queue is full");
            return;
        }
        if (queue.front == -1) {
            // mark from denote first element of queue
            queue.front = 0;
        }
        queue.rear = (queue.rear + 1) % queue.SIZE;
        // insert element at the rear
        queue.items[queue.rear] = object;
        System.out.println("Insert " + object.toString());
    }

    // delete element from the queue
    public static Object deQueue(ArrayQueueADT queue) {
        // if queue is empty
        if (isEmpty(queue)) {
            System.out.println("Queue is empty");
            return null;
        }

        // remove element from the front of queue
        Object object = queue.items[queue.front];
        queue.items[queue.front] = null;

        // if the queue has only one element
        if (queue.front == queue.rear) {
            queue.front = -1;
            queue.rear = -1;
        }
        else {
            // mark next element as the front
            queue.front = (queue.front + 1) % queue.SIZE;
        }

        System.out.println(object.toString() + " Deleted");
        return object;
    }

    public static void display(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            System.out.println("Empty Queue");
        }
        else {
            // display the front of the queue
            System.out.println("\nFront index-> " + queue.front);
            // display element of the queue
            System.out.print("Items-> ");
            for (int i = queue.front; i != queue.rear; i = (i + 1) % queue.SIZE) {
                System.out.print(queue.items[i] + " ");
            }
            System.out.print(queue.items[queue.rear]);
            // display the rear of the queue
            System.out.println("\nRear index-> " + queue.rear);
        }
    }

    public static Object element(ArrayQueueADT queue) {
        if (!isEmpty(queue)) return queue.items[queue.front];
        return null;
    }

    public static long size(ArrayQueueADT queue) {
        if (isEmpty(queue)) return 0;
        return queue.rear - queue.front + 1;
    }

    public static void clear(ArrayQueueADT queue) {
        for (int i = 0; i < queue.SIZE; i++)
            queue.items[i] = null;
        queue.front = -1;
        queue.rear = -1;
    }
}
