package com.doit.recursive;

import java.util.Scanner;

public class Question03 {

	static int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return (x);
	}

	// 요솟수 n인 배열 a의 모든 요소의 최대 공약수를 구합니다.
	static int gcdArray(int a[], int start, int no) {
		if (no == 1)
			return a[start];
		else if (no == 2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start + 1, no - 1));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이");
		int[] a = new int[sc.nextInt()];
		for(int i =0;i<a.length;i++) {
			System.out.println("a["+i+"] = ");
			a[i]=sc.nextInt();
		}
		
		System.out.println(gcdArray(a, 0, a.length));
	}
}
