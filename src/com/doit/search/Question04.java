package com.doit.search;

import java.util.Scanner;

public class Question04 {

	static int BinSearchX(int[] a, int n, int key) {
		int start=0;
		int last=a.length-1;
		do {
			int center = (start+last)/2;
			if(a[center]==key){
				
				/*for(int i=0;i<center;i++) {
					if(a[i]==key) {
						return i;
					}
				}*/
				for (; center >start; center--) // key와 같은 맨 앞의 요소를 찾습니다
					if (a[center - 1] < key)
						break;
				return center;
			}else if(key>a[center]) {
				start=center+1;
			}else {
				last=center-1;
			}
		}while(start<=last);
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner  stdIn = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요솟수 num인 배열

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]："); // 맨 앞 요소를 읽어 들임
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]：");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]); // 하나 앞의 요소보다 작으면 다시 입력
		}

		System.out.print("찾는 값："); // 키 값을 입력 받음
		int ky = stdIn.nextInt();

		int idx = BinSearchX(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
	}
}
