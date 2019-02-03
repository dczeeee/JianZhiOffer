package ����min������ջ;

import java.util.Stack;

/*
 * ��Ŀ����
����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
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
