class recursiveBubbleSort {

	public static void recursive_Bubble_Sort(int[] arr, int n) {
		if (n < 2) {
			return;
		}

		int didSwap = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				didSwap = 1;
			}
		}
		if (didSwap == 0) {
			return;
		}

		recursive_Bubble_Sort(arr, n - 1);
	}

	public static void iterative_Bubble_Sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1, 4, -1 };
		// iterative_Bubble_Sort(arr);
		recursive_Bubble_Sort(arr, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
	}
}
