package Arrays;

class third_smallest {

	public static int thirdSmallestNumber(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int thirdSmallest = Integer.MAX_VALUE;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] < smallest) {
				thirdSmallest = secondSmallest;
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < secondSmallest && arr[i] != smallest) {
				thirdSmallest = secondSmallest;
				secondSmallest = arr[i];
			} else if (arr[i] < thirdSmallest && arr[i] != secondSmallest && arr[i] != smallest) {
				thirdSmallest = arr[i];
			}
			i++;
		}
		return thirdSmallest;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1 };
		System.out.println(thirdSmallestNumber(arr));
	}
}
