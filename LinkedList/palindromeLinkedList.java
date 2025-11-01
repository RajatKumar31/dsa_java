package linkedList;

import java.util.Stack;

class Solution {

	// brute force
	public static boolean isPalindrome_bruteForce(ListNode head) {
		Stack<ListNode> stack = new Stack<>();
		ListNode temp = head;
		while (temp != null) {
			stack.push(temp);
			temp = temp.next;
		}
		temp = head;
		while (!stack.isEmpty()) {
			ListNode node = stack.pop();
			if (temp.val != node.val) {
				return false;
			}
			temp = temp.next;
		}
		return true;
	}

	// optimal method

	public static boolean isPalindrome(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode mid = slow;
		ListNode reversedListHead = reverse(mid);
		ListNode temp1 = head;
		ListNode temp2 = reversedListHead;
		while (temp1 != null && temp2 != null) {
			if (temp1.val != temp2.val) {
				return false;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return true;
	}

	private static ListNode reverse(ListNode head) {
		return head;
	}
}
