public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<Integer>();
        alist.print();
        System.out.println("size: " + alist.size() + "\n");

        //testing add
        for (int i = 0; i < 5; i++) {
            System.out.println("Adding " + i);
            alist.add(i);
            alist.print();
        }

        System.out.println();

        //testing remove at an index
        for (int i = 4; i >= 0; i--) {
            System.out.println("Removing index " + i);
            alist.remove(i);
            alist.print();
        }

        System.out.println();

        System.out.println("Adding 0 to 9");
        for (int i = 0; i < 10; i++) {
            alist.add(i);
        }
        alist.print();

        //testing get
        for (int i = 0; i < 10; i++) {
            System.out.println("Data at index " + i + ": " + alist.get(i));
        }
    }    
}
