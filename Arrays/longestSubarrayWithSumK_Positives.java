class Solution {

	// this is the optimal solutin when all the elements in the array are
	// positive(including 0)
	public static int longestSubarrayWithSumK(int[] a, long k) {
		int left = 0, right = 0, sum = a[0];
		int maxLength = 0;
		int n = a.length;
		while (right < n) {
			while (left < right && sum > k) {
				sum = sum - a[left];
				left++;
			}
			if (sum == k) {
				maxLength = Math.max(maxLength, right - left + 1);
			}

			right++;
			if (right < n) {
				sum = sum + a[right];
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 0, 0, 0, 1, 1, 2, 4, 1, 5 };
		System.out.println(longestSubarrayWithSumK(arr, 6));
	}
}
