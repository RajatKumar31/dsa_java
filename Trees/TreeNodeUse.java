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
		sc.close();
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TreeNode<Integer> root = takeInput_recursive(sc);
		// print_recursive(root);
		TreeNode<Integer> root = takeInput_levelWise();
		print_levelWise(root);
		System.out.println("count : " + countNodes(root));
		System.out.println("sum : " + sumOfNodes(root));
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
