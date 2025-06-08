package Arrays;

import java.util.Stack;

class valid_parentheses {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		int i = 0;
		while (i < s.length()) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
					return false;
				}
			}
			i++;
		}
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "((){}";
		System.out.println(isValid(s));
	}
}
