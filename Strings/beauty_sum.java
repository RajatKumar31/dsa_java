package Strings;

import java.util.HashMap;
import java.util.Map;

class Solution {

	public static int beautySum(String s) {
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			Map<Character, Integer> freqMap = new HashMap<>();
			for (int j = i; j < s.length(); j++) {
				freqMap.put(s.charAt(j), freqMap.getOrDefault(s.charAt(j), 0) + 1);
				int max = Integer.MIN_VALUE;
				int min = Integer.MAX_VALUE;
				for (int value : freqMap.values()) {
					max = Math.max(value, max);
					min = Math.min(value, min);
				}
				ans = ans + (max - min);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(beautySum("aabcbaa"));
	}
}
