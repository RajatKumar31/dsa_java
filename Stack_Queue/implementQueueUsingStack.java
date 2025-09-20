package stack_queue;

import java.util.*;

class MyQueue {

	Stack<Integer> stack1;
	Stack<Integer> stack2;

	public MyQueue() {
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		this.stack1 = stack1;
		this.stack2 = stack2;
	}

	public void push(int x) {
		while (!this.stack1.isEmpty()) {
			this.stack2.push(this.stack1.pop());
		}
		this.stack2.push(x);
		while (!this.stack2.isEmpty()) {
			this.stack1.push(this.stack2.pop());
		}
	}

	public int pop() {
		return this.stack1.pop();
	}

	public int peek() {
		return this.stack1.peek();
	}

	public boolean empty() {
		return this.stack1.isEmpty();
	}
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
