package com.app.tester;

class Stack{
	private int[] array ;
	private int capacity;
	private int top;
	
	public Stack(int capacity) {
		this.capacity=capacity;
		array = new int[capacity];
		top=-1;
	}
	
	public void push(int element) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is full...");
		}
		else {
			++top;
			array[top]=element;
		}
	}
	
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Already empty......");
		}
		else {
			int ret=array[top];
			--top;
			return ret;
		}
	}
	
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty......");
		}
		else {
			return array[top];
		}
	}
	
	private boolean isFull() {
		return top == capacity-1;
	}
	
	private boolean isEmpty() {
		return top == -1;
	}
}
public class StackImpl {

	public static void main(String[] args) {
		
		Stack stack = new Stack(5);
		
		try {
			stack.pop();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			stack.push(1);
			stack.push(5);
			stack.push(6);
			int peek = stack.peek();
			System.out.println(peek);
			stack.push(7);
			stack.push(8);
			peek = stack.peek();
			System.out.println(peek);
			stack.push(8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
