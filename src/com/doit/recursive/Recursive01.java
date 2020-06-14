package com.doit.recursive;

import java.util.Scanner;

public class Recursive01 {

	static int factorial(int n){
		if(n>0) {
			return n*factorial(n-1);
		}else {
			return 1;
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("n! = "+factorial(n));
	}
}
