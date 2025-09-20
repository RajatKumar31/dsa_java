import java.util.*;

class Solution {
	public static boolean isHappy(int n) {
		int num = n;
		int sum = 0;
		HashSet<Integer> set = new HashSet<>();
		while (num > 0) {
			while (num > 0) {
				int remainder = num % 10;
				sum = sum + remainder * remainder;
				num = num / 10;
			}
			num = sum;
			sum = 0;
			if (set.contains(num)) {
				return false;
			}
			if (num == 1) {
				return true;
			}
			set.add(num);
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 2;
		System.out.println(isHappy(n));
	}
}
