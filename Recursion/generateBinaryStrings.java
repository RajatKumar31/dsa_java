package Recursion;

import java.util.*;

class Solution {

	public static List<String> generateBinaryStrings(int n) {
		return helper(n, "", new ArrayList<>());
	}

	public static List<String> helper(int n, String s, List<String> result) {
		if (s.length() == n) {
			result.add(s);
			return result;
		}

		helper(n, s + '0', result);
		if (s.length() == 0 || s.charAt(s.length() - 1) != '1') {
			helper(n, s + '1', result);
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> list = generateBinaryStrings(4);
		for (String s : list) {
			System.out.print(s + " ");
		}
	}
}
