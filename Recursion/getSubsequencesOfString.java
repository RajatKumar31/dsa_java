package Recursion;

import java.util.*;

class Solution {

	public static List<String> getSubsequences(String s) {
		List<String> result = new ArrayList<>();
		StringBuilder current = new StringBuilder();
		helper(0, s, current, result);
		return result;
	}

	private static void helper(int index, String s, StringBuilder current, List<String> result) {
		if (index == s.length()) {
			result.add(current.toString());
			return;
		}

		helper(index + 1, s, current, result);

		current.append(s.charAt(index));
		helper(index + 1, s, current, result);
		current.deleteCharAt(current.length() - 1);
	}

	/*********************
	 * DIFFERENT METHOD
	 *********************/
	public static List<String> getSubsequences2(String s) {
		return helper2(s);
	}

	public static List<String> helper2(String s) {
		if (s.length() <= 1) {
			List<String> result = new ArrayList<>();
			result.add(s);
			return result;
		}
		List<String> ans = helper2(s.substring(1));
		List<String> result = new ArrayList<>();
		for (String str : ans) {
			result.add(str);
		}
		result.add(s.substring(0, 1));
		for (String str : ans) {
			result.add(s.charAt(0) + str);
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> ans = getSubsequences("abc");
		for (String str : ans) {
			System.out.print(str + ", ");
		}
	}
}
