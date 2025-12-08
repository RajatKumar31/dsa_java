package Arrays;

import java.util.HashMap;

class Solution {

	public static int longestSubarrayWithSumZero(int arr[]) {
		int sum = 0, maxLength = 0;
		HashMap<Integer, Integer> preSumMap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum == 0) {
				maxLength = i + 1;
			} else {
				if (preSumMap.containsKey(sum)) {
					maxLength = Math.max(maxLength, i - preSumMap.get(sum));
				} else {
					preSumMap.put(sum, i);
				}
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
		int maxLength = longestSubarrayWithSumZero(arr);
		System.out.println(maxLength);
	}
}
