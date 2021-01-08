// BST of ints with NO DUPLICATES
public class BinarySearchTree {

    private class Node {
        int value;
        Node left = null;
        Node right = null;
        public Node(int value) {
            this.value = value;
        }
    }

    private Node head = null;
    private int size = 0;

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
            size++;
            return;
        }
        Node currentNode = head;
        while (true) {
            if (value < currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = new Node(value);
                    size++;
                    return;
                } else {
                    currentNode = currentNode.left;
                }
            } else if (value > currentNode.value) {
                if (currentNode.right == null) {
                    currentNode.right = new Node(value);
                    size++;
                    return;
                } else {
                    currentNode = currentNode.right;
                }
            } else {
                return; //since no duplicates are allowed
            }
        }
    }

    // public void remove(int value) {}

    public int peek() {
        return head.value;
    }

    // public int pop() {
    //     int val = peek();
    //     remove(val);
    //     return val;
    // }

    public boolean contains(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (value < currentNode.value) {
                currentNode = currentNode.left;
            } else if (value > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public int size() { return size; }

    //depth-first in-order traversal
    public void print() {
        System.out.print("[ ");
        print(head);
        System.out.println("]");
    }

    private void print(Node node) {
        if (node == null)
            return;
        print(node.left);
        System.out.print(node.value + " ");
        print(node.right);
    }

}