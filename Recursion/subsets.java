package Recursion;

import java.util.*;

class Solution {

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> current = new ArrayList<>();
		helper(0, nums, current, result);
		return result;
	}

	private static void helper(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
		if (index == nums.length) {
			List<Integer> ans = new ArrayList<>(current);
			result.add(ans);
			return;
		}

		helper(index + 1, nums, current, result);

		current.add(nums[index]);
		helper(index + 1, nums, current, result);
		current.removeLast();
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> ans = subsets(nums);
		for (List<Integer> list : ans) {
			System.out.println(list);
		}
	}
}

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
