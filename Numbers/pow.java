class pow {

	public static double myPow(double x, int n) {
		if (x == 0 || x == 1) {
			return x;
		}
		double ans = 1;
		if (n < 0) {
			ans = ans * (1 / x);
			n = -(n + 1);
			x = 1 / x;
		}
		while (n > 0) {
			if (n % 2 == 0) {
				x = x * x;
				n = n / 2;
			} else {
				ans = ans * x;
				n = n - 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(myPow(2, -4));
	}
}
