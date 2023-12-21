package java23.task1;

public class Main {
    public static void main(String[] args) {

        System.out.println("ARRAY_QUEUE_MODULE: SIZE = 5");
        ArrayQueueModule.create(5);
        System.out.println("==================================================\n");

        System.out.print("Attempt to add 15... ");
        ArrayQueueModule.enQueue(15);
        System.out.println("First element: " + ArrayQueueModule.element());

        System.out.print("Attempt to add 32... ");
        ArrayQueueModule.enQueue(32);
        System.out.println("First element: " + ArrayQueueModule.element());

        System.out.print("Attempt to add 19... ");
        ArrayQueueModule.enQueue(19);
        System.out.println("First element: " + ArrayQueueModule.element());

        System.out.print("Attempt to add 6... ");
        ArrayQueueModule.enQueue(6);
        System.out.println("First element: " + ArrayQueueModule.element());

        System.out.print("Attempt to add 13... ");
        ArrayQueueModule.enQueue(13);
        System.out.println("First element: " + ArrayQueueModule.element());

        System.out.print("Attempt to add 199... ");
        ArrayQueueModule.enQueue(199);
        System.out.println("First element: " + ArrayQueueModule.element());

        ArrayQueueModule.display();
        System.out.println("--------------------");

        System.out.println(ArrayQueueModule.deQueue());
        ArrayQueueModule.display();
        System.out.println("First element: " + ArrayQueueModule.element());
        System.out.println("Queue size: " + ArrayQueueModule.size());
        System.out.println("--------------------");

        System.out.println("Clearing queue.....");
        ArrayQueueModule.clear();
        ArrayQueueModule.display();
        System.out.println("First element: " + ArrayQueueModule.element());
        System.out.println("Queue size: " + ArrayQueueModule.size());
        System.out.println("\n==================================================\n\n");


        System.out.println("ARRAY_QUEUE_ADT: SIZE = 5");
        ArrayQueueADT queueADT = new ArrayQueueADT(5) {};
        System.out.println("==================================================\n");

        System.out.print("Attempt to add 64... ");
        ArrayQueueADT.enQueue(queueADT,64);
        System.out.println("First element: " + ArrayQueueADT.element(queueADT));

        System.out.print("Attempt to add 2... ");
        ArrayQueueADT.enQueue(queueADT,2);
        System.out.println("First element: " + ArrayQueueADT.element(queueADT));

        System.out.print("Attempt to add 1990... ");
        ArrayQueueADT.enQueue(queueADT,1990);
        System.out.println("First element: " + ArrayQueueADT.element(queueADT));

        System.out.print("Attempt to add \"stairs\"... ");
        ArrayQueueADT.enQueue(queueADT,"stairs");
        System.out.println("First element: " + ArrayQueueADT.element(queueADT));

        System.out.print("Attempt to add \"true\"... ");
        ArrayQueueADT.enQueue(queueADT,true);
        System.out.println("First element: " + ArrayQueueADT.element(queueADT));

        System.out.print("Attempt to add 199... ");
        ArrayQueueADT.enQueue(queueADT,199);
        System.out.println("First element: " + ArrayQueueADT.element(queueADT));

        ArrayQueueADT.display(queueADT);
        System.out.println("--------------------");

        System.out.println(ArrayQueueADT.deQueue(queueADT));
        ArrayQueueADT.display(queueADT);
        System.out.println("First element: " + ArrayQueueADT.element(queueADT));
        System.out.println("Queue size: " + ArrayQueueADT.size(queueADT));
        System.out.println("--------------------");

        System.out.println("Clearing queue.....");
        ArrayQueueADT.clear(queueADT);
        ArrayQueueADT.display(queueADT);
        System.out.println("First element: " + ArrayQueueADT.element(queueADT));
        System.out.println("Queue size: " + ArrayQueueADT.size(queueADT));
        System.out.println("\n==================================================\n\n");



        System.out.println("ARRAY_QUEUE: SIZE = 5");
        ArrayQueue queue = new ArrayQueue(5);
        System.out.println("==================================================\n");

        System.out.print("Attempt to add \"knuckle\"... ");
        queue.enQueue("knuckle");
        System.out.println("First element: " + queue.element());

        System.out.print("Attempt to add \"true\"... ");
        queue.enQueue(true);
        System.out.println("First element: " + queue.element());

        System.out.print("Attempt to add \"false\"... ");
        queue.enQueue(false);
        System.out.println("First element: " + queue.element());

        System.out.print("Attempt to add \"null\" (string)... ");
        queue.enQueue("null");
        System.out.println("First element: " + queue.element());

        System.out.print("Attempt to add 199... ");
        queue.enQueue(199);
        System.out.println("First element: " + queue.element());

        System.out.print("Attempt to add 0... ");
        queue.enQueue(0);
        System.out.println("First element: " + queue.element());

        queue.display();
        System.out.println("--------------------");

        System.out.println(queue.deQueue());
        queue.display();
        System.out.println("First element: " + queue.element());
        System.out.println("Queue size: " + queue.size());
        System.out.println("--------------------");

        System.out.println("Clearing queue.....");
        queue.clear();
        queue.display();
        System.out.println("First element: " + queue.element());
        System.out.println("Queue size: " + queue.size());
        System.out.println("\n==================================================\n\n");

    }
}
