package com.doit.stackque;

import java.util.EmptyStackException;

public class IntAryQueue {

	private int max;
	private int num; //현재 데이터수
	private int[] que;
	
	
	public class EmptyInIntAryQueue extends RuntimeException{
		public EmptyInIntAryQueue() {}
	}
	
	public class OverflowIntAryQueueException extends RuntimeException{
		public OverflowIntAryQueueException() {}
	}
	
	public IntAryQueue(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max];
		}catch (OutOfMemoryError e) {
			max=0;
		}
	}
	
	//enqueue
	public int enqueue(int x) throws OverflowIntAryQueueException {
		if(num>=max) {
			throw new OverflowIntAryQueueException();
		}
		que[num++]=x;
		return x;
	}
	
	//dequeue
	public int dequeue() throws EmptyInIntAryQueue{
		if(num<=0) {
			throw new EmptyStackException();
		}
		int x = que[0];
		for(int i=0;i<num;i++) {
			que[i]=que[i+1];
		}
		return x;
	}
	
	//peek
	public int peek() throws EmptyInIntAryQueue {
		if(num<=0) {
			throw new EmptyStackException();
		}
		return que[num-1];
	}
	
	//index
	public int indexOf(int x) {
		for(int i=0;i<num;i++) {
			if(x==que[i]) {
				return i;
			}
		}
		return -1;
	}
	
	//clear
	public void clear() {
		num=0;
	}
	
	//capacity -> 용량반환
	public int capacity() {
		return max;
	}
	
	//size
	public int size() {
		return num;
	}
	
	//isempty
	public boolean isEmpty() {
		return num<=0;

	}
	
	//isfull
	public boolean isFull() {
		return num>=max;		
	}
	
	//dump ->머리에서 꼬리 차례로 출력
	public void dump() {
		if(num<=0) {
			System.out.println("비었습니다");
		}else {
			for(int i=0;i<num;i++) {
				System.out.print(que[i]+"  ");
			}
			System.out.println();
		}
	}
	
	
}
