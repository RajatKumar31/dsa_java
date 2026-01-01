package Basics.Maths;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {

	public static List<Integer> getDivisors(int N) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i * i <= N; i++) {
			if (N % i == 0) {
				list.add(i);

				if (i != N / i) {
					list.add(N / i);
				}
			}
		}
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		List<Integer> list = getDivisors(36);
		for (int i : list) {
			System.out.print(i + " , ");
		}
	}
}
