package bst;

public class TestBinarySearchTree {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        // bst.peek(); //throws null pointer exception
        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(1);
        bst.add(9);
        bst.add(0);
        bst.add(10);
        bst.print();
        for (int i = 0; i < 11; i++) {
            System.out.println("contains " + i + ": " + bst.contains(i));
        }
        System.out.println("peek: " + bst.peek());
    }
}