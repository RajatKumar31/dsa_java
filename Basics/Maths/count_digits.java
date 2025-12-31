package Basics.Maths;

class Solution {

	public static int countDigits(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			n = -1 * n;
		}
		return (int) (Math.log10(n) + 1);
	}

	public static int countDigits_bruteForce(int n) {
		int digitsCount = 0;

		while (n > 0) {
			n = n / 10;
			digitsCount++;
		}

		return digitsCount;
	}

	public static void main(String[] args) {
		System.out.println(countDigits(0));
	}
}
