package com.doit.stackque;

public class IntQueue {

	private int max; //용량
	private int front;//첫번째 요소의 커서
	private int rear;//마지막 요소의 커서
	private int num;//현재 데이터 수
	private int[] que;//큐
	
	public class EmptyInIntQueueException extends RuntimeException{
		public EmptyInIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	//constructor
	public IntQueue(int capacity) {
		max = capacity;
		num = front = rear = 0;
		try {
			que = new int[max]; 
		} catch (OutOfMemoryError e) {
			max =0;
		}
	}
	
	//enqueue
	public int enqueue(int x) throws OverflowIntQueueException{
		if(num>=max) {
			throw new OverflowIntQueueException();
		}
		que[rear++] = x;
		num++;
		if(rear==max) {
			rear=0;
		}
		return x;
	}
	
	//dequeue
	public int dequeue() throws EmptyInIntQueueException{
		if(num<=0) {
			throw new EmptyInIntQueueException();
		}
		int x = que[front++];
		num--;
		if(front==max) {
			front=0;
		}
		return x;
	}
	
	//peek
	public int peek() throws EmptyInIntQueueException{
		if(num<=0) {
			throw new EmptyInIntQueueException();
		}
		return que[front];
	}
	
	//index
	public int indexOf(int x) {
		for(int i=0;i<num;i++) {
			int idx =(i+front)%max;
			if(que[idx]==x) {
				return idx;
			}
		}
		return -1;
	}
	
	//clear
	public void claer() {
		front = rear = num =0;
	}
	
	//capacity 용량
	public int capacity() {
		return max;
	}
	
	//size
	public int size() {
		return num;
	}
	
	//isEmpty
	public boolean isEmpty() {
		return num<=0;
	}
	
	//isFull
	public boolean isFull() {
		return num>=max;
	}
	
	//dump(front->rear)
	public void dump() {
		if(num<=0) {
			System.out.println("empty");
		}else {
			for(int i=0;i<num;i++) {
				int idx =(i+front)%max;
				System.out.print(que[idx]+"  ");
			}
			System.out.println();
		}
	}
	
	public int search(int x) {
		if(num<=0){
			throw new EmptyInIntQueueException();
		}
		for(int i=0;i<num;i++) {
			int idx = (i+front)%max;
			if(que[idx]==x) {
				return i+1;
			}
		}
		return 0;
	}
}
