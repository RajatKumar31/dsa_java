package Strings;

class Solution {

	public static int maxDepth(String s) {
		int currentDepth = 0, maximumDepth = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				currentDepth++;
			} else if (s.charAt(i) == ')') {
				currentDepth--;
			}
			maximumDepth = Math.max(currentDepth, maximumDepth);
		}
		return maximumDepth;
	}

	public static void main(String[] args) {
		System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
	}
}
