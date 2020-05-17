package com.doit.stackque;


public class Gstack<E> {

	private int max;
	private int pointer;
	private E[] stk; //element
	
	public static class EmptyInGtackException extends RuntimeException{
		public EmptyInGtackException() {}
	}
	
	public static class OverflowGstackException extends RuntimeException{
		public OverflowGstackException() {}
	}
	
	public Gstack(int capacity) {
		pointer = 0;
		max = capacity;
		try {
			stk = (E[])new Object[max];
		} catch (OutOfMemoryError e) {
			max =0;
		}
	}
	
	//이하상동
	
	
}
