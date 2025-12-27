package Strings;

import java.util.*;

class Solution {

	// this is TUF question (leetcode question requires UPPERCASE LETTERS as well)
	// Optimal approach : use BUCKET SORT or PRIORITY QUEUES
	public static List<Character> frequencySort(String s) {
		Pair[] freqArray = new Pair[26];
		for (int i = 0; i < 26; i++) {
			freqArray[i] = new Pair((char) (i + 'a'), 0);
		}
		for (char c : s.toCharArray()) {
			freqArray[c - 'a'].frequency++;
		}
		Arrays.sort(freqArray, (p1, p2) -> {
			if (p1.frequency != p2.frequency) {
				return p2.frequency - p1.frequency;
			}
			return p1.c - p2.c;
		});

		List<Character> result = new ArrayList<>();
		for (Pair p : freqArray) {
			if (p.frequency > 0) {
				result.add(p.c);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(frequencySort("ttree"));
	}
}

class Pair {

	char c;
	int frequency;

	public Pair(char c, int frequency) {
		this.c = c;
		this.frequency = frequency;
	}
}
