package java23.task2;

import java.util.LinkedList;

public class LinkedQueue implements Queue {
    private final LinkedList<Object> queue;

    public LinkedQueue() {
        queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enQueue(Object object) {
        queue.add(object);
    }

    public Object element() {
        if (!isEmpty()) return queue.get(0);
        return null;
    }

    public Object deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        return queue.pop();
    }

    public int size() {
        return queue.size();
    }

    public void clear() {
        queue.clear();
    }

    public void display() {
        for (Object o : queue) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("LINKED_QUEUE");
        LinkedQueue queue1 = new LinkedQueue();
        System.out.println("==================================================\n");

        System.out.print("Attempt to add \"knuckle\"... ");
        queue1.enQueue("knuckle");
        System.out.println("First element: " + queue1.element());

        System.out.print("Attempt to add \"true\"... ");
        queue1.enQueue(true);
        System.out.println("First element: " + queue1.element());

        System.out.print("Attempt to add \"false\"... ");
        queue1.enQueue(false);
        System.out.println("First element: " + queue1.element());

        System.out.print("Attempt to add \"null\" (string)... ");
        queue1.enQueue("null");
        System.out.println("First element: " + queue1.element());

        System.out.print("Attempt to add 199... ");
        queue1.enQueue(199);
        System.out.println("First element: " + queue1.element());

        System.out.print("Attempt to add 0... ");
        queue1.enQueue(0);
        System.out.println("First element: " + queue1.element());

        queue1.display();
        System.out.println("--------------------");

        System.out.println(queue1.deQueue());
        queue1.display();
        System.out.println("First element: " + queue1.element());
        System.out.println("Queue size: " + queue1.size());
        System.out.println("--------------------");

        System.out.println("Clearing queue.....");
        queue1.clear();
        queue1.display();
        System.out.println("First element: " + queue1.element());
        System.out.println("Queue size: " + queue1.size());
        System.out.println("\n==================================================\n\n");
    }
}
