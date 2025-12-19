package Recursion;

import java.util.*;

class Solution {

	public static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		helper("", 0, 0, n, result);
		return result;
	}

	public static void helper(String current, int open, int close, int n, List<String> result) {
		if (current.length() == 2 * n) {
			result.add(current);
		}
		if (open < n) {
			helper(current + "(", open + 1, close, n, result);
		}
		if (close < open) {
			helper(current + ")", open, close + 1, n, result);
		}
	}

	public static void main(String[] args) {
		List<String> ans = generateParenthesis(3);
		System.out.println(ans);
	}
}
