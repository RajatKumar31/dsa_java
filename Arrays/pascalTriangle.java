import java.util.*;

class Solution {

	public static int nCr(int n, int r) {
		int ans = 1;
		for (int i = 0; i < r; i++) {
			ans = ans * (n - i);
			ans = ans / (i + 1);
		}
		return ans;
	}

	public static int pascalTriangle(int r, int c) {
		return nCr(r - 1, c - 1);
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 1; i <= numRows; i++) {
			list.add(generateRow(i));
		}
		return list;
	}

	public static List<Integer> generateRow(int rowNumber) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		long ans = 1;
		for (int i = 1; i < rowNumber; i++) {
			ans = ans * (rowNumber - i);
			ans = ans / i;
			list.add((int) ans);
		}
		return list;
	}

	public static void main(String[] args) {

	}
}
