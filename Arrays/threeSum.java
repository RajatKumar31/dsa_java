import java.util.*;

class Solution {

	// brute force
	public static List<List<Integer>> threeSum_bruteForce(int[] nums) {
		Arrays.sort(nums);
		Set<List<Integer>> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						// List<Integer> list = new ArrayList<>();
						// list.add(nums[i]);
						// list.add(nums[j]);
						// list.add(nums[k]);
						// set.add(list);
						set.add(Arrays.asList(nums[i], nums[j], nums[k]));
					}
				}
			}
		}
		return new ArrayList<>(set);
	}

	public static List<List<Integer>> threeSum_better(int[] nums) {
		Set<List<Integer>> ans = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			Set<Integer> set = new HashSet<>();
			for (int j = i + 1; j < nums.length; j++) {
				int k = -(nums[i] + nums[j]);
				if (set.contains(k)) {
					List<Integer> list = Arrays.asList(nums[i], nums[j], k);
					Collections.sort(list);
					ans.add(list);
				}
				set.add(nums[j]);
			}
		}
		return new ArrayList<>(ans);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum < 0) {
					j++;
				} else if (sum > 0) {
					k--;
				} else {
					ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
					while (j < k && nums[j] == nums[j - 1]) {
						j++;
					}
					while (j < k && nums[k] == nums[k + 1]) {
						k--;
					}
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> ans = threeSum(nums);
		System.out.println(ans);
	}
}

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
