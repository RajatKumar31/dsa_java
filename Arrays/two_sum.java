
import java.util.*;

class two_sum {

	public static int[] twoSum(int[] nums, int target) {
		// Input: nums = [2,7,11,15], target = 9
		// Output: [0,1]
		// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] ans = { -1, -1 };
		for (int i = 0; i < nums.length; i++) {
			int remaining = target - nums[i];
			if (map.containsKey(remaining)) {
				ans[0] = map.get(remaining);
				ans[1] = i;
				return ans;
			}
			map.put(nums[i], i);
		}
		return ans;
	}

	public static List<List<Integer>> twoSum_optimal(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		int low = 0, high = nums.length - 1;

		while (low < high) {
			int sum = nums[low] + nums[high];
			if (sum < target) {
				low++;
			} else if (sum > target) {
				high--;
			} else {
				ans.add(Arrays.asList(nums[low], nums[high]));
				while (low < high && nums[low] == nums[low + 1]) {
					low++;
				}
				low++;
				// while (low < high && nums[high] == nums[high - 1]) {
				// high--;
				// }
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { -3, -8, -8, -2, -5 };
		List<List<Integer>> ans = twoSum_optimal(arr, -10);
		for (int i = 0; i < ans.size(); i++) {
			List<Integer> l = ans.get(i);
			for (int j = 0; j < l.size(); j++) {
				System.out.print(l.get(j) + " ");
			}
			System.out.println();
		}
		// System.out.println(ans[0]);
		// System.out.println(ans[1]);
	}
}
