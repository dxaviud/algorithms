package search;

public class BinarySearch {

    //Just for int arrays right now
    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        int mid = (low + high)/2;
        while (low <= high) {
            if (value > array[mid]) {
                low = mid + 1;
                mid = (low + high)/2;
            } else if (value < array[mid]) {
                high = mid - 1;
                mid = (low + high)/2;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
        int toFind = 5;
        System.out.println("Index of " + toFind + ": " + binarySearch(array, toFind));
    }

}
