// Given an array arr[] of n elements that contains elements from 0 to n-1, with
// any of these numbers appearing any number of times. The task is to find the
// repeating numbers.
//
// Note: The repeating element should be printed only once.
//
// Example:
//
// Input: n = 7, arr[] = [1, 2, 3, 6, 3, 6, 1]
// Output: 1, 3, 6
// Explanation: The numbers 1 , 3 and 6 appears more than once in the array.
//
// Input : n = 5, arr[] = [1, 2, 3, 4 ,3]
// Output: 3
// Explanation: The number 3 appears more than once in the array.
package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class find_duplicates {

	public static List<Integer> findDuplicates(int[] arr) {
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for (int key : map.keySet()) {
			if (map.get(key) > 1) {
				list.add(key);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 6, 3, 6, 1 };
		List<Integer> list = findDuplicates(arr);
		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}
	}
}
