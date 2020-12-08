public class TestLinkedList {
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.print();
        System.out.println("size: " + linkedList.size() + "\n");

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Adding " + i);
            linkedList.add(i);
            linkedList.print();
            System.out.println("size: " + linkedList.size() + "\n");
        }

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Removing " + i);
            linkedList.remove(i);
            linkedList.print();
            System.out.println("size: " + linkedList.size() + "\n");
        }

        System.out.println("Adding 0 to 9");
        for (int i = 0; i < 10; i++)
        {
            linkedList.add(i);
        }
        linkedList.print();
        System.out.println();

        for (int i = 9; i >= 0; i--)
        {
            System.out.println("Removing at " + i);
            linkedList.removeAt(i);
            linkedList.print();
            System.out.println("size: " + linkedList.size() + "\n");
        }

    }
}
