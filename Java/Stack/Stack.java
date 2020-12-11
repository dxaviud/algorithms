package Stack;

public class Stack<T>
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
    
    private Node top = null;
    private int size = 0;
    
    public void push(T value)
    {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    public T pop()
    {
        if (top == null)
            return null;
        T result = top.value;
        top = top.next;
        size--;
        return result;
    }

    public T peek()
    {
        if (top == null)
            return null;
        return top.value;
    }

    public int size()
    {
        return size;
    }
    
    public boolean isEmpty()
    {
        return top == null;
    }
    
    public void print()
    {
        if (top == null)
        {
            System.out.println("Empty stack\n");
            return;
        }

        Node currentNode = top;
        while (currentNode != null)
        {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
