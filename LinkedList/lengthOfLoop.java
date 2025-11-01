package linkedList;

import java.util.HashMap;

class lengthOfLoop {

	// brute force
	public static int lengthOfLoop_bruteForce(ListNode head) {
		HashMap<ListNode, Integer> map = new HashMap<>();
		ListNode temp = head;
		int timer = 1;
		while (temp != null) {
			if (map.containsKey(temp)) {
				return timer - map.get(temp);
			}
			map.put(temp, timer++);
			temp = temp.next;
		}
		return 0;
	}

	public static int lengthOfLoop_optimal(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		fast = fast.next;
		int count = 1;
		while (slow != fast) {
			fast = fast.next;
			count++;
		}
		return count;
	}
}
