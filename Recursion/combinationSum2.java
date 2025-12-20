package Recursion;

import java.util.*;

class Solution {

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<>();
		helper(0, candidates, target, new ArrayList<>(), result);
		return result;
	}

	public static void helper(int index, int[] candidates, int target, List<Integer> ds, List<List<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<>(ds));
			return;
		}
		for (int i = index; i < candidates.length; i++) {
			if (i > index && candidates[i - 1] == candidates[i]) {
				continue;
			}
			if (candidates[i] > target) {
				break;
			}
			ds.add(candidates[i]);
			helper(i + 1, candidates, target - candidates[i], ds, result);
			ds.remove(ds.size() - 1);
		}
	}

	public static void main(String[] args) {
		int[] candidates = { 1, 1, 1, 2, 2 };
		List<List<Integer>> ans = combinationSum2(candidates, 4);
		for (List<Integer> list : ans) {
			for (int elem : list) {
				System.out.print(elem + ", ");
			}
			System.out.println();
		}
	}
}
