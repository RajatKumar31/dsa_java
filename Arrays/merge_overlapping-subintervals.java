package Arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {

	// optimal method
	public static List<List<Integer>> merge(int[][] intervals) {
		// Sort intervals based on start time
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		// List to store merged intervals
		List<List<Integer>> merged = new ArrayList<>();

		// Traverse through all intervals
		for (int[] interval : intervals) {
			// If merged list is empty or no overlap
			if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < interval[0]) {
				// Add current interval as a new block
				merged.add(Arrays.asList(interval[0], interval[1]));
			} else {
				// Overlapping: update end to max of both
				int last = merged.size() - 1;
				int maxEnd = Math.max(merged.get(last).get(1), interval[1]);
				merged.get(last).set(1, maxEnd);
			}
		}

		return merged;
	}

	// brute force (this is not true brute force, above optimal method has same time
	// complexity)
	public static List<List<Integer>> merge_bruteforce(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		List<List<Integer>> ans = new ArrayList<>();

		int i = 0;
		while (i < intervals.length) {
			int start = intervals[i][0];
			int end = intervals[i][1];

			int j = i + 1;
			while (j < intervals.length && intervals[j][0] <= end) {
				end = Math.max(end, intervals[j][1]);
				j++;
			}
			ans.add(Arrays.asList(start, end));
			i = j;
		}

		return ans;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		List<List<Integer>> ans = merge(arr);
		// for (int i = 0; i < ans.size(); i++) {
		// for (int j = 0; j < ans.get(i).size(); j++) {
		// System.out.println(ans.get(i).get(j));
		// }
		// System.out.println();
		// }
		for (List<Integer> interval : ans) {
			for (int elem : interval) {
				System.out.println(elem);
			}
			System.out.println();
		}
	}
}
