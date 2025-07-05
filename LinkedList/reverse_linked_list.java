package LinkedList;

class reverse_linked_list {

	public static Node<Integer> reverse(Node<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node<Integer> newHead = reverse(head.next);
		Node<Integer> tail = head.next;
		tail.next = head;
		head.next = null;
		return newHead;
	}

	public static void main(String[] args) {
		Node<Integer> node1 = new Node<>(1);
		Node<Integer> node2 = new Node<>(2);
		Node<Integer> node3 = new Node<>(3);
		node1.next = node2;
		node2.next = node3;
		Node<Integer> head = reverse(node1);
		System.out.println(head.data + " " + head.next.data + " " + head.next.next.data);
	}
}
