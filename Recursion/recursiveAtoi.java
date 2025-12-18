package Recursion;

class Solution {

	public static int myAtoi(String s) {
		int i = 0;
		while (i < s.length() && s.charAt(i) == ' ') {
			i++;
		}
		int sign = 1;
		if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
			sign = s.charAt(i) == '-' ? -1 : 1;
			i++;
		}
		return helper(i, s, 0, sign);
	}

	private static int helper(int i, String s, long num, int sign) {
		if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
			return (int) (num * sign);
		}
		num = num * 10 + (s.charAt(i) - '0');
		if (sign * num <= Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		if (sign * num >= Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		return helper(i + 1, s, num, sign);
	}

	public static void main(String[] args) {
		System.out.println(myAtoi("-91283472332"));
	}
}
