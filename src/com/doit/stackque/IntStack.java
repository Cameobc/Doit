package com.doit.stackque;

public class IntStack {

	private int max;
	private int pointer;
	private int[] stk;
	
	//실행 시 예외 -> 스택 비어있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//실행시 예외 -> 스택 가득참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	//constructor
	public IntStack(int capacity) {
		pointer =0;
		max =capacity;
		try {
			stk = new int[max]; //스택본체용배열
		}catch (OutOfMemoryError e) { //생성할수없음
			max = 0;
		}
	}
	
	//push
	public int push(int x) throws OverflowIntStackException{
		if(pointer>=max) {
			throw new OverflowIntStackException();
		}
		return stk[pointer++]=x;
	}
	
	//pop
	public int pop() throws EmptyIntStackException{
		if(pointer<=0) {
			throw new EmptyIntStackException();
		}
		return stk[--pointer];
	}
	
	//peak 스택의 꼭대기에 있는 데이터를 봄
	public int peek() throws EmptyIntStackException{
		if(pointer<=0) {
			throw new EmptyIntStackException();
		}
		return stk[pointer-1];
	}
	
	//스택에서 x를 찾아 일치 시 인덱스를 없을 시 -1을 반환
	public int indexOf(int x) {
		for(int i=(pointer-1);i>=0;i--) {
			if(stk[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
	//스택비우기
	public void clear() {
		pointer=0;
	}
	
	//스택의 용량
	public int capacity() {
		return max;
	}
	
	//스택에 쌓여있는 데이터 수
	public int size() {
		return pointer;
	}
	
	//스택이 비어있는지
	public boolean isEmpty() {
		return pointer<=0;
	}
	
	//스택이 가득찼는지
	public boolean isFull() {
		return pointer>=max;
	}
	
	//스택 안의 모든 데이터 출력(bottom->top)
	public void dump() {
		if(pointer<=0) {
			System.out.println("스택이 비어있습니다.");
		}else {
			for(int i=0;i<pointer;i++) {
				System.out.print(stk[i]+" ");
			}
			System.out.println();
		}
	}
}
