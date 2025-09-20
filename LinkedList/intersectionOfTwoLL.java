package linkedList;

public class intersectionOfTwoLL {
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode tempA = headA, tempB = headB;
		while (tempA != null && tempB != null) {
			if (tempA == tempB) {
				return tempA;
			}
		}
		return null;
	}
}
