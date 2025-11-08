import java.util.Stack;

class sortStack {

	public static void sort_stack(Stack<Integer> stack) {
		if (!stack.isEmpty()) {
			int temp = stack.pop();
			sort_stack(stack);
			insert(stack, temp);
		}
	}

	private static void insert(Stack<Integer> stack, int temp) {
		if (stack.isEmpty() || temp >= stack.peek()) {
			stack.push(temp);
			return;
		}
		int val = stack.pop();
		insert(stack, val);
		stack.push(temp);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(1);
		stack.push(3);
		stack.push(2);
		sort_stack(stack);
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " , ");
		}
	}
}
