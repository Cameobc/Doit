package com.doit.recursive;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result =1;
		for(;n>0;n--) {
			result = result*n;
		}
		
		System.out.println(result);
	}
}
