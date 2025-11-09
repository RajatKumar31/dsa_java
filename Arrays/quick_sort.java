class quick_sort {

	public static void quickSort(int[] arr, int si, int ei) {
		// base case
		// partition
		// quick sort on left part and right part of pivot position
		if (si >= ei) {// 0 , 5
			return;
		}
		int pivotPos = partition(arr, si, ei);
		// System.out.println("pivotPos : " + pivotPos + " , si : " + si + " , ei : " +
		// ei);
		quickSort(arr, si, pivotPos - 1);
		quickSort(arr, pivotPos + 1, ei);
	}

	private static int partition(int[] arr, int si, int ei) {
		// chose pivot at the start index
		// place at its correct position
		// all the elements to the left of pivot should be less than or equal to pivot
		// and right elements should be greater
		// return pivot position

		int pivot = arr[si];
		int count = 0;
		for (int i = si + 1; i <= ei; i++) {
			if (arr[i] <= pivot) {
				count++;
			}
		}

		int pivotPos = si + count;
		int temp = arr[pivotPos];
		arr[pivotPos] = pivot;
		arr[si] = temp;

		int i = si, j = ei;
		while (i < pivotPos && j > pivotPos) {
			if (arr[i] <= pivot) {
				i++;
			} else if (arr[j] > pivot) {
				j--;
			} else {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				i++;
				j--;
			}
		}
		return pivotPos;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 3, 4, 2, 1, 5, 0 };
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
	}
}
