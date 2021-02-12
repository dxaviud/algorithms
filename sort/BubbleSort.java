package sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1,0};
        printArray(array);
        sort(array);
        printArray(array);
        sort(array);
        printArray(array);
    }
    
    private static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sort(int[] a) {
        int i = 0;
        for (; i < a.length - 1 && a[i] <= a[i+1]; i++);
        int jInit = i;
        for (; i < a.length - 1; i++) {
            for (int j = jInit; j < a.length - 1 - i; j++) {
                System.out.println("i: " + i + " j: " + j);
                if (a[j] > a[j+1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }
    
}