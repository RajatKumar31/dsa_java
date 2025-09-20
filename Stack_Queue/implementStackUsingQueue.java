package stack_queue;

import java.util.*;

class MyStack {

	Queue<Integer> queue;

	public MyStack() {
		Queue<Integer> queue = new LinkedList<>();
		this.queue = queue;
	}

	public void push(int x) {
		this.queue.add(x);
		for (int i = 0; i < this.queue.size() - 1; i++) {
			int num = this.queue.poll();
			this.queue.add(num);
		}
	}

	public int pop() {
		return this.queue.poll();
	}

	public int top() {
		return this.queue.peek();
	}

	public boolean empty() {
		return this.queue.isEmpty();
	}
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
