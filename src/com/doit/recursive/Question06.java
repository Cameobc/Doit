package com.doit.recursive;

import java.util.Scanner;

public class Question06 {

	static void hanoi(int num, int x, int y) {
		
		if(num>1) {
			hanoi(num-1, x, 6-x-y);
		}
		
		System.out.println(num+"번째 원반은 "+(char)(x+64)+"에서 "+(char)(y+64)+"로 이동");
		
		if(num>1) {
			hanoi(num-1, 6-x-y, y);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		hanoi(n, 1, 3);
	}
}
