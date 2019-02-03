package 包含min函数的栈;

import java.util.Stack;

/*
 * 题目描述
定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class MinStack {

	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();

	public void push(int node) {
        if(minStack.isEmpty() || node < minStack.peek()) {
        	minStack.push(node);
        }
        else {
        	minStack.push(minStack.peek());
        }
        stack.push(node);
    }
    
    public void pop() {
        minStack.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
