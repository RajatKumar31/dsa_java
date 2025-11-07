class merge_sort {

	public static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int i = low, j = mid + 1, k = 0;
		int ans[] = new int[high - low + 1];
		while (i <= mid && j <= high) {
			if (arr[i] <= arr[j]) {
				ans[k] = arr[i];
				k++;
				i++;
			} else {
				ans[k] = arr[j];
				k++;
				j++;
			}
		}
		while (i <= mid) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		while (j <= high) {
			ans[k] = arr[j];
			k++;
			j++;
		}
		for (int m = 0; m < ans.length; m++) {
			arr[m + low] = ans[m];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 100, 2, 1, 3, 4, 0, -1, 99 };
		mergeSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
