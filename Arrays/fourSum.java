import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;

class Solution {

	// brute force
	public static List<List<Integer>> fourSum_bruteForce(int[] nums, int target) {
		Arrays.sort(nums);
		Set<List<Integer>> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					for (int l = k + 1; l < nums.length; l++) {
						if ((nums[i] + nums[j] + nums[k] + nums[l]) == target) {
							set.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
						}
					}
				}
			}
		}
		return new ArrayList<>(set);
	}

	// better (3 for loops and 1set and 1 more set for unique results)
	public static List<List<Integer>> fourSum_better(int[] nums, int target) {
		Set<List<Integer>> ans = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				Set<Long> set = new HashSet<>();
				for (int k = j + 1; k < nums.length; k++) {
					long currentSum = (long) nums[i] + (long) nums[j] + (long) nums[k];
					long l = (long) target - currentSum;
					if (set.contains(l)) {
						List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], (int) l);
						Collections.sort(list);
						ans.add(list);
					}
					set.add((long) nums[k]);
				}
			}
		}
		return new ArrayList<>(ans);
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < nums.length; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				int k = j + 1;
				int l = nums.length - 1;
				while (k < l) {
					long sum = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];
					if (sum < target) {
						k++;
					} else if (sum > target) {
						l--;
					} else {
						ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
						k++;
						l--;
						while (k < l && nums[k] == nums[k - 1]) {
							k++;
						}
						while (k < l && nums[l] == nums[l + 1]) {
							l--;
						}
					}
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 1000000000, 1000000000, 1000000000, 1000000000 };
		System.out.println(fourSum_better(arr, -294967296));
	}
}
