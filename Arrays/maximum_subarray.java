package Arrays;

class maximum_subarray {

	// return max sum
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

	// print the maximum sum subarray
	public static void printMaximumSubarray(int[] arr) {
		int currentSum = 0, maxSum = Integer.MIN_VALUE;
		int start = 0;
		int ansStart = -1, ansEnd = -1;

		int i = 0;
		while (i < arr.length) {
			if (currentSum == 0) {
				start = i;
			}
			currentSum = currentSum + arr[i];

			if (currentSum > maxSum) {
				ansStart = start;
				ansEnd = i;
				maxSum = currentSum;
			}
			if (currentSum < 0) {
				currentSum = 0;
			}
			i++;
		}

		for (int j = ansStart; j <= ansEnd; j++) {
			System.out.print(arr[j] + ", ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { -1, 1, -2, 4, 1, -3, 10 };
		// System.out.println(maximumSubarray(arr));
		printMaximumSubarray(arr);
	}
}
