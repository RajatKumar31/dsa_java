class Solution {
	public static int getLongestSubarray(int[] nums, int k) {
		int longest = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum = sum + nums[j];
				if (sum == k) {
					longest = Math.max(longest, j - i + 1);
				}
			}
		}
		return longest;
	}

	public static void main(String[] args) {
		int[] nums = { -3, 2, 1 };
		int k = 6;
		System.out.println(getLongestSubarray(nums, k));
	}
}
