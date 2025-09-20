package linkedList;

class Solution {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode tail = null;
		int carry = 0, sum = 0;
		while (l1 != null && l2 != null) {
			sum = l1.val + l2.val + carry;
			carry = 0;
			if (sum >= 10) {
				carry = sum / 10;
				sum = sum % 10;
			}
			ListNode node = new ListNode();
			node.val = sum;
			if (head == null) {
				head = node;
				tail = node;
			} else {
				tail.next = node;
				tail = node;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1 != null) {
			sum = l1.val + carry;
			carry = 0;
			if (sum >= 10) {
				carry = sum / 10;
				sum = sum % 10;
			}
			ListNode node = new ListNode(sum);
			tail.next = node;
			tail = node;
			l1 = l1.next;
		}
		while (l2 != null) {
			sum = l2.val + carry;
			carry = 0;
			if (sum >= 10) {
				carry = sum / 10;
				sum = sum % 10;
			}
			ListNode node = new ListNode(sum);
			tail.next = node;
			tail = node;
			l2 = l2.next;
		}
		if (carry > 0) {
			ListNode node = new ListNode(carry);
			tail.next = node;
		}
		return head;
	}
}
