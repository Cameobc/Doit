package com.doit.recursive;

import java.util.Scanner;

public class Recursive02 {

	static int gcd(int x, int y) {
		if(y==0) {
			return x;
		}else {
			return gcd(y, x%y);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("두 정수의 최대 공약수 = "+gcd(x, y));
	}
	
}
