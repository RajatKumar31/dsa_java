import java.util.*;

class MinStack {
	Stack<Pair<Integer, Integer>> stack;

	public MinStack() {
		this.stack = new Stack<>();
	}

	public void push(int val) {
		if (stack.isEmpty()) {
			Pair<Integer, Integer> pair = new Pair<>(val, val);
			this.stack.push(pair);
		} else {
			Pair<Integer, Integer> pair = new Pair<>(val, Math.min(val, stack.peek().second));
			this.stack.push(pair);
		}
	}

	public void pop() {
		this.stack.pop();
	}

	public int top() {
		return this.stack.peek().first;
	}

	public int getMin() {
		return this.stack.peek().second;
	}
}

class Pair<T, V> {
	T first;
	V second;

	public Pair(T first, V second) {
		this.first = first;
		this.second = second;
	}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
