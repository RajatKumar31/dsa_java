package Basics.Maths;

class Solution {

	public static boolean isArmstrong(int num) {
		int originalNum = num;
		int digits = (int) (Math.log10(num) + 1);
		int sum = 0;
		while (num > 0) {
			int remainder = num % 10;
			sum = sum + (int) Math.pow(remainder, digits);
			num = num / 10;
		}
		if (sum == originalNum) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(372));
	}
}
