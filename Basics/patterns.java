class Solution {

	public static void pattern22(int n) {
		for (int i = 0; i <= (2 * n - 2); i++) {
			for (int j = 0; j <= (2 * n - 2); j++) {
				int top = i, bottom = j, left = (2 * n - 2) - i, right = (2 * n - 2) - j;
				int min = Math.min(Math.min(top, bottom), Math.min(left, right));
				System.out.print(n - min + " ");
			}
			System.out.println();
		}
	}

	public static void pattern20(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = n - 1; k > i; k--) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			for (int k = n - 1; k >= i; k--) {
				System.out.print("  ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern19(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("  ");
			}
			for (int l = n; l > i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = n - 1; k > i; k--) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern18(int n) {
		for (int i = n - 1; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print((char) ('A' + j) + " ");
			}
			System.out.println();
		}
	}

	public static void pattern17(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print((char) ('A' + k));
			}
			for (int l = 0; l < i; l++) {
				System.out.print((char) ('A' + l));
			}
			System.out.println();
		}
	}

	public static void pattern16(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) ('A' + i));
			}
			System.out.println();
		}
	}

	public static void pattern15(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print((char) ('A' + j));
			}
			System.out.println();
		}
	}

	public static void pattern14(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) ('A' + j));
			}
			System.out.println();
		}
	}

	public static void pattern13(int n) {
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

	public static void pattern12(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = n; k > i; k--) {
				System.out.print("  ");
			}
			for (int l = i; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.println();
		}
	}

	public static void pattern11(int n) {
		/*
		 * 1
		 * 0 1
		 * 1 0 1
		 * 0 1 0 1
		 * 1 0 1 0 1
		 */
		for (int i = 1; i <= n; i++) {
			int start = i % 2;
			for (int j = 1; j <= i; j++) {
				System.out.print(start);
				start = 1 - start;
			}
			System.out.println();
		}
	}

	public static void pattern10(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern9(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 1; l < i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			for (int l = n; l > i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern8(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 1; l < i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 1; l < i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern6(int n) {
		/*
		 * 12345
		 * 1234
		 * 123
		 * 12
		 * 1
		 */
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void pattern5(int n) {
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern4(int n) {
		/*
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 */
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {
		/*
		     *
		     **
		     ***
		     ****
		     *****
		*/
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern1(int n) {
		/*
		     *****
		     *****
		     *****
		     *****
		     *****
		*/
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern22(5);
	}
}
