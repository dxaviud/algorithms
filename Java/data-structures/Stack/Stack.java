public class Stack<T>
    {
        private class Node
        {
            T val;
            Node next;
        }
        
        private Node top = null;
        
        public void push(T toPush)
        {
            Node newNode = new Node();
            newNode.val = toPush;
            newNode.next = top;
            top = newNode;
            System.out.println("pushed " + toPush);
        }
        
        public T pop()
        {
            T result = top.val;
            top = top.next;
            System.out.println("Popped " + result);
            return result;
        }
        
        public boolean isEmpty()
        {
            return top == null;
        }
        
        public String toString()
        {
            if (isEmpty()) return "Stack empty";
            String result = "";
            Node current = top;
            while(current != null)
            {
                result += current.val + "->";
                current = current.next;
            }
            return result;
        }
    }
