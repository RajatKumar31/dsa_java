class checkIfArrayIsSortedAndRotated {
	public static boolean check(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[i - 1]) {
				while (i < nums.length - 1) {
					if (nums[i] > nums[i + 1]) {
						return false;
					}
					i++;
				}
				if (nums[0] < nums[nums.length - 1]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(check(arr));
	}
}
