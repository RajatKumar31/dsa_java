package linkedList;

class Solution {
	public static ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode oddHead = head, oddTail = oddHead, evenHead = head.next, evenTail = evenHead;
		while (oddTail != null && oddTail.next != null && evenTail != null && evenTail.next != null) {
			oddTail.next = evenTail.next;
			oddTail = evenTail.next;
			evenTail.next = oddTail.next;
			evenTail = oddTail.next;
		}
		oddTail.next = evenHead;
		return head;
	}
}
