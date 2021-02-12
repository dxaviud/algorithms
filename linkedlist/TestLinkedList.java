public class TestLinkedList {
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.print();
        System.out.println("size: " + linkedList.size() + "\n");

        //testing adding
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Adding " + i);
            linkedList.add(i);
            linkedList.print();
            System.out.println("size: " + linkedList.size() + "\n");
        }

        //testing removing
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Removing " + i);
            linkedList.remove(i);
            linkedList.print();
            System.out.println("size: " + linkedList.size() + "\n");
        }
        System.out.println("isEmpty: " + linkedList.isEmpty() + "\n");

        System.out.println("Adding 0 to 9");
        for (int i = 0; i < 10; i++)
        {
            linkedList.add(i);
        }
        linkedList.print();
        System.out.println();

        //testing removing at an index
        for (int i = 9; i >= 0; i--)
        {
            System.out.println("Removing at " + i);
            linkedList.removeAt(i);
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

        //testing linked list reversal
        System.out.println("Reversing linked list");
        linkedList.reverse();
        linkedList.print();

        System.out.println("Adding 0 to 9");
        for (int i = 0; i < 10; i++)
        {
            linkedList.add(i);
        }
        linkedList.print();
        System.out.println();

        //testing get
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Element at " + i + ": " + linkedList.get(i));
        }

        //testing set
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Setting element at " + i + " to " + i*i);
            linkedList.set(i, i*i);
            linkedList.print();
        }

        //testing insert
        System.out.println("Inserting 99 at index 0");
        linkedList.insert(99, 0);
        linkedList.print();
        for (int i = 10; i < 15; i++)
        {
            System.out.println("Inserting " + i + " at index " + (i-9));
            linkedList.insert(i, i-9);
            linkedList.print();
        }
    }
}
