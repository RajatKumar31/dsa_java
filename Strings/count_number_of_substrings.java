package Strings;

import java.util.HashMap;

class Solution {

	public static int countSubstrings(String s, int k) {
		return atMostKDistinct(s, k) - atMostKDistinct(s, k - 1);
	}

	private static int atMostKDistinct(String s, int k) {
		int res = 0;
		HashMap<Character, Integer> freqMap = new HashMap<>();
		int left = 0;
		for (int right = 0; right < s.length(); right++) {
			freqMap.put(s.charAt(right), freqMap.getOrDefault(s.charAt(right), 0) + 1);

			while (freqMap.size() > k) {
				char leftChar = s.charAt(left);
				freqMap.put(leftChar, freqMap.get(leftChar) - 1);
				if (freqMap.get(leftChar) == 0) {
					freqMap.remove(leftChar);
				}
				left++;
			}

			res = res + (right - left + 1);
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(countSubstrings("abcbaa", 3));
	}

}
