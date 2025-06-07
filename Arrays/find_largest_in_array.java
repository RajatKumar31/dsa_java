package Arrays;

class find_largest_in_array {

	public static int findLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 4, 8 };
		System.out.println(findLargest(arr));
	}
}
