public class LinkedList<T>
{
    private class Node
    {
        T value;
        Node next = null;

        public Node(T value)
        {
            this.value = value;
        }
    }

    private Node head = null;
    private int size = 0;

    public void add(T value)
    {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public boolean remove(T value)
    {
        if (head != null && head.value == value)
        {
            head = head.next;
            size--;
            return true;
        }
        Node previousNode = null;
        Node currentNode = head;
        while (currentNode != null)
        {
            if (currentNode.value == value)
            {
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

    public boolean removeAt(int index)
    {
        if (index < 0 || index >= size)
            return false;
        if (head != null && index == 0)
        {
            head = head.next;
            size--;
            return true;
        }
        Node previousNode = null;
        Node currentNode = head;
        for (int i = 0; i < index; i++)
        {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = currentNode.next;
        currentNode = null;
        size--;
        return true;
    }

    public int size()
    {
        return size;
    }

    public void print()
    {
        if (head == null)
        {
            System.out.println("Empty list");
            return;
        }
        Node currentNode = head;
        while (currentNode != null)
        {
            System.out.print(currentNode.value + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

}