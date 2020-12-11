public class SelectionSort{

    public static void main(String []args){
        int[] a = {9,8,7,6,5,4,3,2,1,0,2,3,4,6,7,3,3,6,3,63,363};
        printArray(a);
        sort(a);
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
    private static int min(int[] a, int start)
    {
        int minimum = start;
        for (int i = start; i < a.length; i++)
        {
            if (a[minimum] > a[i])
                minimum = i;
        }
        return minimum;
    }
    public static void sort(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            int minIndex = min(a, i);
            swap(a, i, minIndex);
        }
    }
}
