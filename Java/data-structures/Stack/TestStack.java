class TestStack {
    public static void main(String[] args) {
    
        Stack<Integer> stack = new Stack<Integer>();

        stack.print();
        System.out.println("isEmpty: " + stack.isEmpty());

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Pushing " + i + "\n");
            stack.push(i);
            stack.print();
            System.out.println("Peek: " + stack.peek() + "  Size: " + stack.size() + "\n");
        }

        System.out.println("isEmpty: " + stack.isEmpty());

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Popping\n");
            stack.pop();
            stack.print();
            System.out.println("Peek: " + stack.peek() + "  Size: " + stack.size() + "\n");
        }

        System.out.println("isEmpty: " + stack.isEmpty());

    }
}
