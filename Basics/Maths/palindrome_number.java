package Basics.Maths;

class Solution {

	public static boolean isPalindrome(int x) {
		int originalNum = x;
		int reversedNum = 0;
		while (x > 0) {
			int rem = x % 10;
			reversedNum = reversedNum * 10 + rem;
			x = x / 10;
		}
		if (originalNum == reversedNum) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(12321));
	}
}
