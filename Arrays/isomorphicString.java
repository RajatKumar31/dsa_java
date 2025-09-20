import java.util.*;

class Solution {
	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map = new HashMap<>();
		HashSet<Character> set = new HashSet<>();
		if (s.length() != t.length()) {
			return false;
		}
		int i = 0;
		while (i < s.length()) {
			Character c1 = s.charAt(i);
			Character c2 = t.charAt(i);
			if (!map.containsKey(c1) && !set.contains(c2)) {
				map.put(c1, c2);
				set.add(c2);
			} else if ((!map.containsKey(c1) && set.contains(c2)) || map.get(c1) != c2) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "eggg", t = "addt";
		System.out.println(isIsomorphic(s, t));
	}
}
