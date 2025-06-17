package Arrays;

class maximum_subarray {

	public static int maximumSubarray(int[] arr) {
		// input : {-1,1,-2,4,1,-3}
		int currentSum = 0, maxSum = Integer.MIN_VALUE;
		int i = 0;
		while (i < arr.length) {
			currentSum = currentSum + arr[i];
			maxSum = Math.max(maxSum, currentSum);
			if (currentSum < 0) {
				currentSum = 0;
			}
			i++;
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] arr = { -1, 1, -2, 4, 1, -3 };
		System.out.println(maximumSubarray(arr));
	}
}
