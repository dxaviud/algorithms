package queue;

public class TestQueue {

    public static void main(String[] args) {
        
        Queue<Integer> queue = new Queue<Integer>();

        queue.print();
        System.out.println("isEmpty: " + queue.isEmpty() + "\n");

        //testing enqueue
        for (int i = 0; i < 5; i++) {
            System.out.println("Enqueuing " + i + "\n");
            queue.enqueue(i);
            queue.print();
            System.out.println("Peek: " + queue.peek() + "  Size: " + queue.size() + "\n");
        }

        System.out.println("isEmpty: " + queue.isEmpty() + "\n");

        //testing dequeue
        for (int i = 0; i < 5; i++) {
            System.out.println("Dequeuing " + queue.dequeue() + "\n");
            queue.print();
            System.out.println("Peek: " + queue.peek() + "  Size: " + queue.size() + "\n");
        }
        
        System.out.println("isEmpty: " + queue.isEmpty() + "\n");

    }

}