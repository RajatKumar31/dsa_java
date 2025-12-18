package Recursion;

class Solution {

	private static final int MOD = 1000000007;

	public static int countGoodNumbers(long n) {
		return helper(0, n);
	}

	private static int helper(int index, long n) {
		if (index == n) {
			return 1;
		}

		int result = 0;

		// even index
		if (index % 2 == 0) {
			int arr[] = { 0, 2, 4, 6, 8 };
			for (int elem : arr) {
				result = (result + helper(index + 1, n)) % MOD;
			}
		}

		// odd index
		else {
			int arr[] = { 2, 3, 5, 7 };
			for (int elem : arr) {
				result = (result + helper(index + 1, n)) % MOD;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 2;
		System.out.println(countGoodNumbers(n));
	}
}
