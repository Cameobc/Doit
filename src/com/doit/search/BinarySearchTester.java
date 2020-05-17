package com.doit.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수:");
		int[]x = new int[sc.nextInt()];
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.println("x[0]:");
		x[0] = sc.nextInt();
		
		for(int i=1;i<x.length;i++) {
			do {
				System.out.println("x["+i+"]:");
				x[i]=sc.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.println("검색할값:");
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx<0) {
			System.out.println(-idx-1);
		}else {
			System.out.println(key+"는 x["+idx+"]에 있습니다.");
		}
	}
}
