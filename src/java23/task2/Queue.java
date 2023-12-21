package java23.task2;

public interface Queue {
    void display();
    void enQueue(Object object);
    Object deQueue();
    Object element();
    int size();
    void clear();
}
