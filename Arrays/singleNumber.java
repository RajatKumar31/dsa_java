class Solution {
	public static int singleNumber(int[] nums) {
		int unique = 0, i = 0;
		while (i < nums.length) {
			unique = unique ^ nums[i];
			i++;
		}
		return unique;
	}
}
