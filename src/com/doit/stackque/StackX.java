package com.doit.stackque;

public class StackX {

	private int pointer1;
	private int pointer2;
	private int max;
	private int[] stk;
	
	public enum AorB{
		Stack1, Stack2
	}
	
	//실행 시 예외 -> 스택 비어있음
	public class EmptyStackXException extends RuntimeException{
		public EmptyStackXException() {}
	}
		
	//실행시 예외 -> 스택 가득참
	public class OverflowStackXException extends RuntimeException{
		public OverflowStackXException() {}
	}
	
	//생성자
	public StackX(int capacity) {
		pointer1=0;
		pointer2=capacity-1;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max=0;
		}
	}
	
	//push
	public int push(AorB st, int x) throws OverflowStackXException{
		if(pointer1 >= pointer2+1) {
			throw new OverflowStackXException();
		}
		switch (st) {
		case Stack1:
			stk[pointer1++]=x;
			break;

		case Stack2:
			stk[pointer2--]=x;
			break;
		}
		return x;
	}
	
	//pop
	public int pop(AorB st) throws EmptyStackXException{
		int x=0;
		switch (st) {
		case Stack1:
			if(pointer1<=0) {
				throw new EmptyStackXException();
			}
			x=stk[--pointer1];
			break;
		case Stack2:
			if(pointer2>max-1) {
				throw new EmptyStackXException();
			}
			x=stk[++pointer2];
			break;
		}
		return x;
	}
	
}
