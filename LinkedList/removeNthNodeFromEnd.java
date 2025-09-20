package linkedList;

class Solution {
	public static int lengthOfLL(ListNode head) {
		int length = 0;
		ListNode temp = head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		return length;
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return null;
		}
		int length = lengthOfLL(head);
		n = length - n;
		if (n < 0) {
			return null;
		}
		ListNode prev = null, current = head;
		while (n > 0 && current != null) {
			n--;
			prev = current;
			current = current.next;
		}
		if (prev != null) {
			prev.next = current.next;
		} else {
			head = head.next;
		}
		return head;
	}
}
