class Solution {
	public static void nextPermutation(int[] nums) {
		int breakPoint = -1;
		int n = nums.length;
		// find the break point
		for (int i = n - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				breakPoint = i;
				break;
			}
		}
		if (breakPoint == -1) {
			for (int i = 0; i < n / 2; i++) {
				int temp = nums[i];
				nums[i] = nums[n - i - 1];
				nums[n - i - 1] = temp;
			}
			return;
		}
		// find the element just larger than the breakPoint element
		for (int i = n - 1; i > breakPoint; i--) {
			if (nums[i] > nums[breakPoint]) {
				int temp = nums[breakPoint];
				nums[breakPoint] = nums[i];
				nums[i] = temp;
				break;
			}
		}
		// reverse the array after the breakPoint
		for (int i = 0; i < (n - breakPoint) / 2; i++) {
			int temp = nums[breakPoint + i + 1];
			nums[breakPoint + i + 1] = nums[n - i - 1];
			nums[n - i - 1] = temp;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 2, 1, 5, 4, 3, 0, 0 };
		nextPermutation(nums);
		System.out.println(nums.length);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
