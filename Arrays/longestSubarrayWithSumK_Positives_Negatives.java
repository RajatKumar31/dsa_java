import java.util.HashMap;

class Solution {

	// this is the optimal solution when elements in the array can be +ve and -ve
	// both
	public static int longestSubarrayWithSumK(int[] a, long k) {
		HashMap<Long, Integer> preSumMap = new HashMap<>();
		int n = a.length;
		long sum = 0;
		int maxLength = 0;
		int i = 0;
		while (i < n) {
			sum = sum + a[i];
			if (sum == k) {
				maxLength = Math.max(maxLength, i + 1);
			}
			long remaining = sum - k;
			if (preSumMap.containsKey(remaining)) {
				maxLength = Math.max(maxLength, i - preSumMap.get(remaining));
			}
			if (!preSumMap.containsKey(sum)) {
				preSumMap.put(sum, i);
			}
			i++;
		}
		return maxLength;
	}

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 3, 0, 0, 0, 1, 1, 2, 4, 1, 5 };
		int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
		System.out.println(longestSubarrayWithSumK(arr, 3));
	}
}
