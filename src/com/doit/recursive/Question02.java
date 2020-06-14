package com.doit.recursive;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result;
		
		while(y!=0) {
			int z = y;
			y = x%y;
			x = z;
		}
		
		System.out.println(x);
	}
}
