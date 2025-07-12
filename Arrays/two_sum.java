package Arrays;

import java.util.HashMap;

class two_sum {

	public static int[] twoSum(int[] nums, int target) {
		// Input: nums = [2,7,11,15], target = 9
		// Output: [0,1]
		// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] ans = { -1, -1 };
		for (int i = 0; i < nums.length; i++) {
			int remaining = target - nums[i];
			if (map.containsKey(remaining)) {
				ans[0] = map.get(remaining);
				ans[1] = i;
				return ans;
			}
			map.put(nums[i], i);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int[] ans = twoSum(arr, 9);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
	}
}
