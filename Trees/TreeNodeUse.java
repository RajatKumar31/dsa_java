import java.util.*;

class TreeNodeUse {

	// take input recursive
	public static TreeNode<Integer> takeInput_recursive(Scanner sc) {
		System.out.println("Enter the next node");
		int data = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(data);
		System.out.println("Enter the number of children");
		int childCount = sc.nextInt();
		for (int i = 0; i < childCount; i++) {
			TreeNode<Integer> childNode = takeInput_recursive(sc);
			root.children.add(childNode);
		}
		return root;
	}

	// print tree recursive
	public static void print_recursive(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String s = root.data + " : ";
		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + " , ";
		}
		System.out.println(s);
		for (int i = 0; i < root.children.size(); i++) {
			print_recursive(root.children.get(i));
		}
	}

	// take input level-wise
	public static TreeNode<Integer> takeInput_levelWise() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the node");
		int data = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(data);
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode<Integer> frontNode = queue.poll();
			System.out.println("Enter the number of children of " + frontNode.data);
			int childCount = sc.nextInt();
			for (int i = 0; i < childCount; i++) {
				System.out.println("Enter the " + (i + 1) + "th child of " + frontNode.data);
				int childData = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<>(childData);
				frontNode.children.add(childNode);
				queue.add(childNode);
			}
		}
		return root;
	}

	// print tree level-wise
	public static void print_levelWise(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode<Integer> frontNode = queue.poll();
			String s = frontNode.data + " : ";
			for (int i = 0; i < frontNode.children.size(); i++) {
				s = s + frontNode.children.get(i).data + " , ";
				queue.add(frontNode.children.get(i));
			}
			System.out.println(s);
		}
	}

	// count nodes
	public static int countNodes(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int count = 1;
		for (int i = 0; i < root.children.size(); i++) {
			count = count + countNodes(root.children.get(i));
		}
		return count;
	}

	/// sum of nodes
	public static int sumOfNodes(TreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int sum = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			sum = sum + sumOfNodes(root.children.get(i));
		}
		return sum;
	}

	// find the largest node
	public static int largestNode(TreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int largest = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			int childLargest = largestNode(root.children.get(i));
			largest = Math.max(largest, childLargest);
		}
		return largest;
	}

	// count nodes which are greater than k
	public static int nodesGreaterThanX(TreeNode<Integer> root, int k) {
		if (root == null) {
			return 0;
		}
		int count = 0;
		if (root.data > k) {
			count = count + 1;
		}
		for (int i = 0; i < root.children.size(); i++) {
			count = count + nodesGreaterThanX(root.children.get(i), k);
		}
		return count;
	}

	public static int height(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int height = 0;
		for (int i = 0; i < root.children.size(); i++) {
			int childHeight = height(root.children.get(i));
			height = Math.max(height, childHeight);
		}
		return height + 1;
	}

	// print nodes at depth K
	public static void printAtDepthK(TreeNode<Integer> root, int depth) {
		if (root == null) {
			return;
		}
		if (depth == 0) {
			System.out.print(root.data + " ");
			return;
		}
		for (int i = 0; i < root.children.size(); i++) {
			printAtDepthK(root.children.get(i), depth - 1);
		}
	}

	// count the leaf nodes
	public static int countLeafNodes(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int count = 0;
		if (root.children.size() == 0) {
			count = 1;
		}
		for (int i = 0; i < root.children.size(); i++) {
			count = count + countLeafNodes(root.children.get(i));
		}
		return count;
	}

	// preOrderTraversal
	public static void preOrderTraversal(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		for (int i = 0; i < root.children.size(); i++) {
			preOrderTraversal(root.children.get(i));
		}
	}

	// postOrder traversal
	public static void postOrderTraversal(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		for (int i = 0; i < root.children.size(); i++) {
			postOrderTraversal(root.children.get(i));
		}
		System.out.print(root.data + " ");
	}

	// check if the tree contains x
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x) {
		if (root == null) {
			return false;
		}

		Boolean ans = false;
		if (root.data == x) {
			ans = true;
			return ans;
		}

		for (int i = 0; i < root.children.size(); i++) {
			ans = checkIfContainsX(root.children.get(i), x);
			if (ans == true) {
				return true;
			}
		}
		return ans;
	}

	// node with max sum of root data and its immediate children
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		TreeNode<Integer> maxSumNode = root;
		int maxSum = sum(root);
		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> childMaxNode = maxSumNode(root.children.get(i));
			int childSum = sum(childMaxNode);
			if (maxSum < childSum) {
				maxSum = childSum;
				maxSumNode = childMaxNode;
			}
		}
		return maxSumNode;
	}

	private static int sum(TreeNode<Integer> root) {
		int sum = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			sum = sum + root.children.get(i).data;
		}
		return sum;
	}

	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
		if ((root1.data != root2.data) || (root1.children.size() != root2.children.size())) {
			return false;
		} else {
			for (int i = 0; i < root1.children.size(); i++) {
				boolean ans = checkIdentical(root1.children.get(i), root2.children.get(i));
				if (ans == false) {
					return false;
				}
			}
		}
		return true;
	}

	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n) {
		if (root == null) {
			return null;
		}
		TreeNode<Integer> nextLargerNode = null;
		if (root.data > n) {
			nextLargerNode = root;
		}
		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> nextLargerChildNode = findNextLargerNode(root.children.get(i), n);
			if ((nextLargerNode != null && nextLargerChildNode != null
					&& nextLargerNode.data > nextLargerChildNode.data)
					|| (nextLargerNode == null && nextLargerChildNode != null)) {
				nextLargerNode = nextLargerChildNode;
			}
		}
		return nextLargerNode;
	}

	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		TreeNode<Integer> largest = root;
		TreeNode<Integer> secondLargestNode = null;
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode<Integer> frontNode = queue.poll();
			if (frontNode.data > largest.data) {
				secondLargestNode = largest;
				largest = frontNode;
			} else if (secondLargestNode != null && frontNode.data > secondLargestNode.data) {
				secondLargestNode = frontNode;
			}
			for (int i = 0; i < frontNode.children.size(); i++) {
				queue.add(frontNode.children.get(i));
			}
		}
		return secondLargestNode;
	}

	public static void replaceWithDepthValue(TreeNode<Integer> root) {
		replaceWithDepthValue_helper(root, 0);
	}

	private static void replaceWithDepthValue_helper(TreeNode<Integer> root, int depth) {
		if (root == null) {
			return;
		}
		root.data = depth;
		for (int i = 0; i < root.children.size(); i++) {
			replaceWithDepthValue_helper(root.children.get(i), depth + 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TreeNode<Integer> root = takeInput_recursive(sc);
		// print_recursive(root);
		TreeNode<Integer> root = takeInput_levelWise();
		print_levelWise(root);
		System.out.println("count : " + countNodes(root));
		System.out.println("sum : " + sumOfNodes(root));
		System.out.println("largest : " + largestNode(root));
		System.out.println("nodesGreaterThanX : " + nodesGreaterThanX(root, 3));
		System.out.println("height : " + height(root));
		System.out.println("leaf Nodes : " + countLeafNodes(root));
		printAtDepthK(root, 2);
		System.out.println();
		preOrderTraversal(root);
		System.out.println();
		postOrderTraversal(root);
		System.out.println();
		System.out.println("checkIfContainsX : " + checkIfContainsX(root, 11));
		System.out.println("maxSumNode : " + maxSumNode(root).data);
		System.out.println();
		System.out.println("next larger node : " + findNextLargerNode(root, 3).data);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("second largest node : " + findSecondLargest(root).data);
		// replaceWithDepthValue(root);
		// print_levelWise(root);
		// TreeNode<Integer> root1 = takeInput_levelWise();
		// TreeNode<Integer> root2 = takeInput_levelWise();
		// System.out.println("check identical : " + checkIdentical(root1, root2));
		sc.close();
	}

}

class TreeNode<T> {
	T data;
	ArrayList<TreeNode<T>> children;

	public TreeNode(T data) {
		this.data = data;
		this.children = new ArrayList<>();
	}
}
