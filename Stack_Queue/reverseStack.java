import java.util.Stack;

class reverseStack {

	public static void reverse_stack(Stack<Integer> stack) {
		if (!stack.isEmpty()) {
			int temp = stack.pop();
			reverse_stack(stack);
			insert(stack, temp);
		}
	}

	private static void insert(Stack<Integer> stack, int temp) {
		if (stack.isEmpty()) {
			stack.push(temp);
			return;
		}
		int val = stack.pop();
		insert(stack, temp);
		stack.push(val);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(1);
		stack.push(3);
		stack.push(2);
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " , ");
		}
		reverse_stack(stack);
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " , ");
		}
	}
}
