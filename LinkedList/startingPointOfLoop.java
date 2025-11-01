package linkedList;

import java.util.HashMap;

public class startingPointOfLoop {

	// brute force
	public static ListNode detectCycle_bruteForce(ListNode head) {
		HashMap<ListNode, Integer> map = new HashMap<>();
		ListNode temp = head;
		while (temp != null) {
			if (map.containsKey(temp)) {
				return temp;
			}
			map.put(temp, 1);
			temp = temp.next;
		}
		return null;
	}

	// optimal solution
	public static ListNode detectCycle(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		if (fast == null || fast.next == null) {
			return null;
		}
		slow = head;
		while (fast != slow) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
