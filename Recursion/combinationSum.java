package Recursion;

import java.util.List;
import java.util.ArrayList;

class Solution {

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		helper(0, candidates, target, ans, ds);
		return ans;
	}

	private static void helper(int index, int[] candidates, int target, List<List<Integer>> ans,
			List<Integer> ds) {
		if (target < 0) {
			return;
		}
		if (target == 0) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		if (index >= candidates.length) {
			return;
		}
		// pick
		ds.add(candidates[index]);
		helper(index, candidates, target - candidates[index], ans, ds);
		ds.remove(ds.size() - 1);

		// not pick
		helper(index + 1, candidates, target, ans, ds);
	}

	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		List<List<Integer>> ans = combinationSum(candidates, 7);
		for (List<Integer> list : ans) {
			System.out.println(list);
		}
	}
}
