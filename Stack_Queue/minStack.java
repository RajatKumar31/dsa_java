import java.util.*;

class MinStack {
	Stack<Long> stack;
	long min;

	public MinStack() {
		this.stack = new Stack<>();
		this.min = Integer.MAX_VALUE;
	}

	public void push(int val) {
		if (this.stack.isEmpty()) {
			this.stack.push((long) val);
			this.min = val;
		} else if (val > min) {
			this.stack.push((long) val);
		} else {
			// FORMULA : 2*val - prevMin = newVal
			long newVal = (2 * (long) val) - this.min;
			this.stack.push(newVal);
			this.min = val;
		}
	}

	public void pop() {
		if (this.stack.peek() < this.min) {
			this.min = 2 * this.min - this.stack.peek();
		}
		this.stack.pop();
	}

	public int top() {
		if (this.stack.peek() < min) {
			return (int) this.min;
		} else {
			long peek = this.stack.peek();
			return (int) peek;
		}
	}

	public int getMin() {
		return (int) this.min;
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
