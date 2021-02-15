package linkedlist;

public class LinkedList<T> {

    private class Node {
        T value;
        Node next = null;
        
        public Node(T value) {
            this.value = value;
        }
    }

    private Node head = null;
    private int size = 0;

    private boolean validateIndex(int index) {
        return 0 <= index && index < size;
    }

    public void add(T value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T set(int index, T value) {
        if (!validateIndex(index))
            return null;
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        T t = currentNode.value;
        currentNode.value = value;
        return t;
    }

    public boolean remove(T value) {
        if (head != null && head.value == value) {
            head = head.next;
            size--;
            return true;
        }
        Node previousNode = null;
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                previousNode.next = currentNode.next;
                currentNode = null;
                size--;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        return false;
    }

    public boolean removeAt(int index) {
        if (!validateIndex(index)) {
            return false;
        }
        if (head != null && index == 0) {
            head = head.next;
            size--;
            return true;
        }
        Node previousNode = null;
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = currentNode.next;
        currentNode = null;
        size--;
        return true;
    }

    public boolean insert(T value, int index) {
        if (!validateIndex(index)) {
            return false;
        }
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return true;
        } else {
            Node previousNode = null;
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            previousNode.next = newNode;
            newNode.next = currentNode;
            size++;
            return true;
        }
    }

    public void reverse() {
        if (head == null || size == 1)
            return;
        Node previousNode = null;
        Node currentNode = head;
        Node nextNode = head.next;
        while (true) {
            currentNode.next = previousNode;
            if (nextNode == null) {
                head = currentNode;
                return;
            }
            previousNode = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.next;
        }
    }
    
    public T get(int index) {
        if (!validateIndex(index)) {
            return null;
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

}