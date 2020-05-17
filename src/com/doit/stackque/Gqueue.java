package com.doit.stackque;

public class Gqueue<E> {

	private int max;
	private int num;
	private int front;
	private int rear;
	private E[] que;
	
	public static class EmptyInGqueueException extends RuntimeException{
		public EmptyInGqueueException() {}
	}
	
	public static class OverflowGqueueException extends RuntimeException{
		public OverflowGqueueException() {}
	}
	
	public Gqueue(int capacity){
		num = front = rear =0;
		max = capacity;
		try {
			que = (E[])new Object[max];
		}catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public E enque(E x) throws OverflowGqueueException{
		if(num>=max) {
			throw new OverflowGqueueException();
		}
		que[rear++] = x;
		num++;
		if(rear==max) {
			rear =0;
		}
		return x;
	}
	
	public E deque() throws EmptyInGqueueException{
		if(num<=0) {
			throw new EmptyInGqueueException();
		}
		E x = que[front++];
		num--;
		if(front==max) {
			front=0;
		}
		return x;
	}
}
