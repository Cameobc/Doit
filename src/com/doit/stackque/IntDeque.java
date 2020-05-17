package com.doit.stackque;

public class IntDeque {

	private int num;
	private int front;
	private int rear;
	private int max;
	private int[] que;
	
	public class EmptyInIntDequeException extends RuntimeException{
		public EmptyInIntDequeException() {}
	}
	
	public class OverflowIntDequeException extends RuntimeException{
		public OverflowIntDequeException() {}
	}
	
	public IntDeque(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		}catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enqueFront(int x) throws OverflowIntDequeException{
		if(num>=max) {
			throw new OverflowIntDequeException();
		}
		num++;
		if(--front==0) {
			front = max-1;
		}
		que[front] = x;
		return x;
	}
	
	public int enqueRear(int x) throws OverflowIntDequeException{
		if(num>=max) {
			throw new OverflowIntDequeException();
		}
		que[rear++] = x;
		num++;
		if(rear==max) {
			rear = 0;
		}
		return x;
	}
	
	public int dequeFront() throws EmptyInIntDequeException{
		if(num<=0) {
			throw new EmptyInIntDequeException();
		}
		int x = que[front++];
		num--;
		if(front==max) {
			front = 0;
		}
		return x;
	}
	
	public int dequeRear() throws EmptyInIntDequeException{
		if(num<=0) {
			throw new EmptyInIntDequeException();
		}
		num--;
		if(--rear<0) {
			rear = max-1;
		}
		int x = que[rear];
		return x;
	}
	
	public int peekRear() throws EmptyInIntDequeException {
		if (num <= 0)
			throw new EmptyInIntDequeException(); // 덱(deck)이 비어 있음
		return que[rear == 0 ? max - 1 : rear - 1];
	}
	
}
