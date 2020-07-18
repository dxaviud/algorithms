class Main {
  public static void main(String[] args) {
    
    Stack<Integer> s = new Stack<Integer>();

    for (int i = 0; i < 5; i++)
    {
      s.push(i);
      System.out.println(s);
    }

    for (int i = 0; i < 5; i++)
    {
      s.pop();
      System.out.println(s);
    }

    System.out.println("s is empty: "+s.isEmpty());

  }
}
