package Arrays;

class find_second_largest_in_array {

	public static int findSecondLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(findSecondLargest(arr));
	}
}
