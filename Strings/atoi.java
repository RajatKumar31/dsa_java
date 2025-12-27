package Strings;

class Solution {

	// iterative approach (recursive approach is in Recursion folder)
	public static int myAtoi(String s) {
		long ans = 0;
		// trim whitespaces
		int i = 0;
		while (i < s.length() && s.charAt(i) == ' ') {
			i++;
		}
		if (i == s.length()) {
			return (int) ans;
		}
		int sign = 1;
		if (s.charAt(i) == '-') {
			sign = -1;
		}
		i++;
		while (i < s.length() && Character.isDigit(s.charAt(i))) {
			ans = ans * 10 + (s.charAt(i) - '0');
			i++;
		}
		return (int) (ans * sign);
	}

	public static void main(String[] args) {
		System.out.println(myAtoi("-00000"));
	}
}
