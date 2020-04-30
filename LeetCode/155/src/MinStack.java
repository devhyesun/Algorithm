import java.util.*;

class MinStack {
    Stack<Node> stack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(new Node(x, stack.size() == 0 ? x : Math.min(x, getMin())));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
    
    class Node {
    	int val;
    	int min;
    	
    	public Node(int val, int min) {
    		this.val = val;
    		this.min = min;
    	}
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */