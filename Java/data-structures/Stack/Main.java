class Main {
  public static void main(String[] args) {
    
    Stack<Integer> stack = new Stack<Integer>();

    for (int i = 0; i < 5; i++)
    {
      stack.push(i);
    }

    stack.print();

    for (int i = 0; i < 5; i++)
    {
      System.out.println("Popping\n");
      stack.pop();
      stack.print();
    }

    System.out.println("isEmpty: " + stack.isEmpty());

  }
}
