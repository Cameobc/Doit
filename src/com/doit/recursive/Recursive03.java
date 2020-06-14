package com.doit.recursive;

import java.util.Scanner;

public class Recursive03 {

	static void recur(int n) {
		if(n>0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	static void recur2(int n) {
		if(n>0) {
			recur2(n-2);
			System.out.println(n);
			recur2(n-1);
		}
	}
	
	static void recur3(int n) {
		while(n>0) {
			recur3(n-1);
			System.out.println(n);
			n = n-2;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		recur2(x);
	}
}
