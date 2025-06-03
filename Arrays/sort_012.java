package Arrays;

class sort_012 {

	public static void sort012(int[] arr) {
		// This problem is a variation of the popular Dutch National flag algorithm.
		int low = 0, mid = 0, high = arr.length - 1;
		while (mid < high) {
			if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 0) {
				// swap arr[low] and arr[mid]
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			} else if (arr[mid] == 2) {
				// swap arr[mid] and arr[high]
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}

		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 2, 2, 1, 1, 1, 0, 0, 0 };
		sort012(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
