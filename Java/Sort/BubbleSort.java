public class BubbleSort {
    
    public static void sort(int[] a)
    {
        for (int i = 0; i < a.length - 2; i++)
        {
            for (int j = i + 1; j < a.length - 1; j++)
            {
                if (a[j] > a[j+1])
                {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void printArray(int[] a)
    {
        for (int i : a) 
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int[] array = {9,8,7,6,5,4,3,2,1,0};
        printArray(array);
        sort(array);
        printArray(array);

    }
}
