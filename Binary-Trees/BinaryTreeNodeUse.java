import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class BinaryTreeNodeUse {

	public static BinaryTreeNode<Integer> takeInput_levelwise() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the root node data");
		int rootData = sc.nextInt();
		if (rootData == -1) {
			sc.close();
			return null;
		}
		BinaryTreeNode<Integer> rootNode = new BinaryTreeNode<>(rootData);
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(rootNode);
		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = queue.poll();
			System.out.println("Enter the left child of : " + frontNode.data);
			int leftData = sc.nextInt();
			if (leftData != -1) {
				BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(leftData);
				frontNode.left = leftNode;
				queue.add(leftNode);
			}
			System.out.println("Enter the right child of " + frontNode.data);
			int rightData = sc.nextInt();
			if (rightData != -1) {
				BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<>(rightData);
				frontNode.right = rightNode;
				queue.add(rightNode);
			}
		}
		sc.close();
		return rootNode;
	}

	public static void print_levelwise(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = queue.poll();
			String s = frontNode.data + " : ";
			if (frontNode.left != null) {
				s = s + " L : " + frontNode.left.data;
				queue.add(frontNode.left);
			}
			if (frontNode.right != null) {
				s = s + " R : " + frontNode.right.data;
				queue.add(frontNode.right);
			}
			System.out.println(s);
		}
	}

	public static BinaryTreeNode<Integer> takeInput_recursive(Scanner sc) {
		System.out.println("Enter the node");
		int data = sc.nextInt();
		if (data == -1) {
			return null;
		}
		BinaryTreeNode<Integer> rootNode = new BinaryTreeNode<>(data);
		rootNode.left = takeInput_recursive(sc);
		rootNode.right = takeInput_recursive(sc);
		return rootNode;
	}

	public static void print_recursive(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String s = root.data + " : ";
		if (root.left != null) {
			s = s + " L : " + root.left.data;
		}
		if (root.right != null) {
			s = s + " R : " + root.right.data;
		}
		System.out.println(s);
		print_recursive(root.left);
		print_recursive(root.right);
	}

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// BinaryTreeNode<Integer> root = takeInput_recursive(sc);
		BinaryTreeNode<Integer> root = takeInput_levelwise();
		// print_recursive(root);
		print_levelwise(root);
	}
}

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}
