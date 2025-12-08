import java.util.*;

class Solution {

	public static List<Integer> majorityElement_mooreVotingAlgorithm(int[] nums) {
		int element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;
		int count1 = 0, count2 = 0;
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (count1 == 0 && nums[i] != element2) {
				count1++;
				element1 = nums[i];
			} else if (count2 == 0 && nums[i] != element1) {
				count2++;
				element2 = nums[i];
			} else if (nums[i] == element1) {
				count1++;
			} else if (nums[i] == element2) {
				count2++;
			} else {
				count1--;
				count2--;
			}
		}

		int element1Count = 0, element2Count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == element1) {
				element1Count++;
			} else if (nums[i] == element2) {
				element2Count++;
			}
		}
		if (element1Count > nums.length / 3) {
			list.add(element1);
		}
		if (element2Count > nums.length / 3) {
			list.add(element2);
		}
		return list;
	}

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
