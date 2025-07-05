package Arrays;

class rotate_array_by_k_steps {

	public static void reverse(int[] arr, int start, int end) {
		while (start >= 0 && end <= arr.length - 1 && start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void rotate(int[] nums, int k) {
		if (k > nums.length) {
			k = k - nums.length;
		}
		reverse(nums, 0, nums.length - k - 1);
		reverse(nums, nums.length - k, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(arr, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
