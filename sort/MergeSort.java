package sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 2, 4, 2, 1, 24, 6, 7, 2, 2, 4, 3, 2, 4, 7, 890, 0, 5, 456,
				46, 3 };
		System.out.println("unsorted array:");
		printArray(array);
		sort(array);
		System.out.println("sorted array:");
		printArray(array);
	}

	public static void printArray(int[] a) {
		for (int elem : a) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}

	public static void sort(int[] a) {
		if (a.length <= 1) {
			return;
		}
		int[] auxiliaryArray = new int[a.length];
		int low = 0, mid = (a.length - 1) / 2, high = a.length - 1;
		recursiveSort(a, auxiliaryArray, low, mid, high);
	}

	private static void recursiveSort(int[] a, int[] auxiliaryArray, int low, int mid, int high) {
		if (low >= high) {
			return;
		}
		recursiveSort(a, auxiliaryArray, low, (low + mid) / 2, mid);
		recursiveSort(a, auxiliaryArray, mid + 1, (mid + 1 + high) / 2, high);
		merge(a, auxiliaryArray, low, mid, high);
	}

	private static void merge(int[] a, int[] auxiliaryArray, int low, int mid, int high) {
		for (int i = low; i < high + 1; i++) {
			auxiliaryArray[i] = a[i];
		}
		int j = low;
		int k = mid + 1;
		for (int i = low; i < high + 1; i++) {
			if (j > mid) {
				a[i] = auxiliaryArray[k++];
			} else if (k > high) {
				a[i] = auxiliaryArray[j++];
			} else if (auxiliaryArray[j] > auxiliaryArray[k]) {
				a[i] = auxiliaryArray[k++];
			} else {
				a[i] = auxiliaryArray[j++];
			}
		}
	}
	
}
