package Arrays;

import java.util.HashMap;

class majority_element {

	public static int majorityElement_mooreVotingAlgorithm(int[] arr) {
		int element = -1;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (count == 0) {
				element = arr[i];
				count++;
			} else if (arr[i] == element) {
				count++;
			} else {
				count--;
			}
		}
		int elementCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				elementCount++;
			}
		}
		if (elementCount > arr.length / 2) {
			return element;
		}
		return -1;
	}

	public static int majorityElement_usingHashmap(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		for (int key : map.keySet()) {
			if (map.get(key) > arr.length / 2) {
				return key;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 9, 2, 2, 9, 2 };
		// System.out.println(majorityElement_usingHashmap(arr));
		System.out.println(majorityElement_mooreVotingAlgorithm(arr));
	}
}
