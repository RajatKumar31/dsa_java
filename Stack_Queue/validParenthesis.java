package stack_queue;

import java.util.*;

class Solution {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.add(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
					return false;
				}
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}
		return true;
	}
}
