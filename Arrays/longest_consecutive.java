package Arrays;

import java.util.HashSet;
import java.util.Set;

class longest_consecutive {

	public static int longestConsecutive(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int longest = 1;
		for (int elem : set) {
			if (!set.contains(elem - 1)) {
				int x = elem;
				int count = 1;
				while (set.contains(x + 1)) {
					x++;
					count++;
				}
				longest = Math.max(longest, count);
			}
		}
		return longest;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 14, 15 };
		System.out.println(longestConsecutive(arr));
	}
}
