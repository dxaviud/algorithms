public class InsertionSort{

    public static void main(String []args){
        int[] a = {9,8,7,6,5,4,3,2,1,0,2,3,4,6,7,3,3,6,3,63,363};
        printArray(a);
        insertionSort(a);
        printArray(a);
    }
    
    public static void printArray(int[] a)
    {
        for (int elem : a)
            System.out.print(elem + " ");
        System.out.println();
    }
    
    private static void swap(int[] a, int first, int second)
    {
        int temporary = a[first];
        a[first] = a[second];
        a[second] = temporary;
    }
    
    public static void insertionSort(int[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            int j = i;
            while (j > 0)
            {
                if (a[j-1] > a[j]) swap(a, j-1, j);
                else break;
                j--;
            }
        }
    }
}
