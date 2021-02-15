package queue;

public class Queue<T> {
    
    private class Node {
        T value;
        Node next = null;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node front = null;
    private Node back = null;
    private int size = 0;

    public void enqueue(T value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = newNode;
            back = newNode;
            size++;
            return;
        }
        back.next = newNode;
        back = newNode;
        size++;
    }

    public T dequeue() {
        if (front == null) {
            return null;
        }
        T result = front.value;
        front = front.next;
        size--;
        return result;
    }

    public T peek() {
        if (front == null) {
            return null;
        }
        return front.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void print() {
        if (front == null) {
            System.out.println("Empty queue\n");
            return;
        }

        Node currentNode = front;
        while (currentNode != null) {
            System.out.print(currentNode.value + "->");
            currentNode = currentNode.next;
        }
        System.out.println(null + "\n");
    }

}