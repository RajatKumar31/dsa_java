package Strings;

class reverse_string_wordwise {

	public static String reverseWords(String s) {
		StringBuilder ans = new StringBuilder();
		int i = s.length() - 1;
		while (i >= 0) {
			// remove spaces
			while (i >= 0 && s.charAt(i) == ' ') {
				i--;
			}
			if (i < 0) {
				break;
			}
			int end = i;
			while (i >= 0 && s.charAt(i) != ' ') {
				i--;
			}
			int start = i + 1;
			String word = s.substring(start, end + 1);
			if (ans.length() != 0) {
				ans.append(' ');
			}
			ans.append(word);
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		String str = "Hello my  name  is Rajat Kumar ";
		System.out.println(reverseWords(str));
	}
}

// welcome to the show
// show the to welcome
