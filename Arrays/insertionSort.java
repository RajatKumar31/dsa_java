class insertionSort {

	public static void insertion_sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i, k = arr[j];
			while (j > 0 && k < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = k;
		}
	}

	public static void recursive_insertion_sort(int[] arr, int index) {
		if (index == arr.length) {
			return;
		}
		int j = index, k = arr[index];
		while (j > 0 && k < arr[j - 1]) {
			arr[j] = arr[j - 1];
			j--;
		}
		arr[j] = k;
		recursive_insertion_sort(arr, index + 1);
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
		recursive_insertion_sort(arr, 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
	}
}
