import java.util.*;

class Solution {
	public static List<Integer> majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		List<Integer> list = new ArrayList<>();
		for (int key : map.keySet()) {
			if (map.get(key) > nums.length / 3) {
				list.add(key);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 3 };
		System.out.println(majorityElement(nums));
	}
}
