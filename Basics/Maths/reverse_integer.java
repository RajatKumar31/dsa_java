package Basics.Maths;

class Solution {

	public static int reverse(int x) {
		int sign = 1;
		if (x < 0) {
			sign = -1;
			x = -1 * x;
		}
		long reversedNum = 0;
		while (x > 0) {
			int remainder = x % 10;
			reversedNum = reversedNum * 10 + remainder;
			x = x / 10;
		}
		if ((sign * reversedNum) < Integer.MIN_VALUE || (sign * reversedNum) > Integer.MAX_VALUE) {
			return 0;
		}
		return (int) (sign * reversedNum);
	}

	public static void main(String[] args) {
		// 1534236469
		System.out.println(reverse(1534236469));
	}
}
