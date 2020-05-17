package com.doit.search;

import java.util.Scanner;

public class Search01 {
	
	static int seqSearch(int[] a, int n, int key) {
		int i=0;
		
		while(true) {
			//fail
			if(i==n) {
				return -1;
			}
			//success
			if(a[i]==key) {
				return i;
			}
			
			i++;
		}
	}
	
	public static int seqSearch1(int[] a, int n, int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.println("x["+i+"] : ");
			x[i]=sc.nextInt();
		}
		
		System.out.println("검색할 값:");
		int key = sc.nextInt();
		int idx = seqSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("해당 값의 요소가 없습니다.");
		}else {
			System.out.println(key+"는 x["+idx+"]에 있습니다.p");
		}
	}

}
