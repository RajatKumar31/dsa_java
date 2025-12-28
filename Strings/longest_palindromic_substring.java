package Strings;

class Solution {

	public static String longestPalindrome(String s) {
		int start = 0, end = 0;
		for (int center = 0; center < s.length(); center++) {
			int oddLength = expandFromCenter(s, center, center);
			int evenLength = expandFromCenter(s, center, center + 1);
			int maxLength = Math.max(oddLength, evenLength);
			if (maxLength > (end - start)) {
				start = center - (maxLength - 1) / 2;
				end = center + (maxLength / 2);
			}
		}
		return s.substring(start, end + 1);
	}

	private static int expandFromCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome("babab"));
	}
}
