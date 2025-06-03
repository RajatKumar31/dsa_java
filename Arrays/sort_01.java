package Arrays;

class sort_01 {

	public static void sort01(int[] arr) {
		// input : arr[] = {1,1,0,1,0,0}
		int low = 0, high = arr.length - 1;
		while (low < high) {
			if (arr[low] == 0) {
				low++;
			} else if (arr[high] == 1) {
				high--;
			} else {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 1, 0, 0 };
		sort01(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
