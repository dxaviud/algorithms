public class MergeSort {

  enum MergeType
  {
    recursive, bottomUp
  }

  public static MergeType mergeType = MergeType.recursive;

  public static void main(String[] args) {
    int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 2, 4, 2, 1, 24, 6, 7, 2, 2, 4, 3, 2, 4, 7, 890, 0, 5, 456,
        46, 3 };
    System.out.println("unsorted array:");
    printA(array);
    mergeSort(array);
    System.out.println("mergesorted array:");
    printA(array);

  }

  public static void printA(int[] a) {
    for (int elem : a)
      System.out.print(elem + " ");
    System.out.println();
  }

  public static void mergeSort(int[] a) {
    if (a.length <= 1)
      return;
    int[] aux = new int[a.length];
    if (MergeSort.mergeType == MergeType.recursive)
      sort(a, aux, 0, (a.length - 1) / 2, a.length - 1);
    else if (MergeSort.mergeType == MergeType.bottomUp)
      sortBU(a, aux, 0, (a.length - 1) / 2, a.length - 1);
  }

  private static void sort(int[] a, int[] aux, int low, int mid, int high) {
    // System.out.println("sort called, low: " + low + " high: " + high);
    if (low >= high)
      return; // base case?
    sort(a, aux, low, (low + mid) / 2, mid);
    sort(a, aux, mid + 1, (mid + 1 + high) / 2, high);
    merge(a, aux, low, mid, high);
  }

  private static void sortBU(int[] a, int[] aux, int low, int mid, int high) { // bottom up version, no recursion
    for (int size = 1; size < a.length; size *= 2) {
      for (low = 0; low < a.length - size; low += 2 * size) {
        merge(a, aux, low, (2 * low + 2 * size - 1) / 2, Math.min(low + 2 * size - 1, a.length - 1));
      }
    }
  }

  private static void merge(int[] a, int[] aux, int low, int mid, int high) {
    // System.out.println("{");
    // System.out.println("merge called, low: " + low + " high: " + high);
    for (int i = low; i < high + 1; i++) {
      aux[i] = a[i];
    }
    // System.out.print("auxilliary array: ");
    // printA(aux);

    int j = low;
    // System.out.println("j: " + j);
    int k = mid + 1;
    // System.out.println("k: " + k);
    for (int i = low; i < high + 1; i++) {
      // System.out.println("for loop iteration: " + i);
      if (j > mid) {
        a[i] = aux[k++];
      } else if (k > high) {
        a[i] = aux[j++];
      } else if (aux[j] > aux[k])
        a[i] = aux[k++];
      else
        a[i] = aux[j++];
      // System.out.println("j: " + j + " k: " + k);
      // printA(a);
    }

    // System.out.println("} merge finished");
  }

}
