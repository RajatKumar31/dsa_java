class Pow {

	// logN -> time complexity
	public static int power(int x, int n) {
		if (x == 0 || x == 1) {
			return x;
		}
		int ans = 1;
		if (n < 0) {
			ans = ans * (1 / x);
			n = -(n + 1);
		}
		while (n > 0) {
			if (n % 2 == 0) {
				ans = ans * ans;
				n = n / 2;
			} else {
				ans = ans * x;
				n = n - 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(power(2, 5));
	}
}
