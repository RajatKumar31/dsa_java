package Arrays;

class find_missing_element_in_array {

	public static int findMissingElement(int[] arr, int n) {
		// [1,2,3,5]
		int xor1 = 0, xor2 = 0;
		for (int i = 1; i <= n; i++) {
			xor1 = xor1 ^ i;
		}
		for (int i = 0; i < arr.length; i++) {
			xor2 = xor2 ^ arr[i];
		}
		return xor1 ^ xor2;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		System.out.println(findMissingElement(arr, 5));
	}
}
