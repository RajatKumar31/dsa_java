package Strings;

class string_compression {

	public static String stringCompression(String str) {
		int previous = 0, current = 0;
		String ans = "";
		int count = 0;
		while (current < str.length()) {
			if (str.charAt(current) == str.charAt(previous)) {
				count++;
				current++;
			} else {
				ans = ans + str.charAt(previous) + count;
				previous = current;
				count = 0;
			}
		}
		ans = ans + str.charAt(previous) + count;
		return ans;
	}

	public static void main(String[] args) {
		// Input: "aaabbcddaae" → "a3b2c1d2a2e1".
		String str = "aaabbcddaae";
		System.out.println(stringCompression(str));
	}
}
