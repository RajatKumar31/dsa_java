package Recursion;

class Solution {

	public static double pow(double x, int n) {
		if (x == 0 || x == 1) {
			return x;
		}
		if (n == 0) {
			return 1;
		}

		if (n < 0) {
			return 1 / x * pow(1 / x, -(n + 1));
		}

		if (n % 2 == 0) {
			return pow(x * x, n / 2);
		} else {
			return x * pow(x, n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(pow(2, 10));
	}
}
