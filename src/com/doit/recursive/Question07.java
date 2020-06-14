package com.doit.recursive;

import java.util.Scanner;

public class Question07 {
	
		//6에서 빼는 이유 -> 기둥이 3개(1, 2, 3)
		//3기둥의 합이 6이므로 시작 기둥, 목표 기둥이 어느 기둥이라도 중간 기둥은 6-x-y로 구할 수 있음
		static void move(int no, int x, int y) {
			int[] xstk = new int[100];
			int[] ystk = new int[100];
			int[] sstk = new int[100]; // 스택
			int ptr = 0; // 스택 포인터
			int sw = 0;

			while (true) {
				if (sw == 0 && no > 1) {
					xstk[ptr] = x; // x의 값을 푸시
					ystk[ptr] = y; // y의 값을 푸시
					sstk[ptr] = sw; // sw의 값을 푸시
					ptr++;
					no = no - 1;
					y = 6 - x - y;
					continue;
				}

				System.out.printf("[%d]를 %d기둥에서 %d기둥으로 옮김\n", no, x, y);

				if (sw == 1 && no > 1) {
					xstk[ptr] = x; // x의 값을 푸시
					ystk[ptr] = y; // y의 값을 푸시
					sstk[ptr] = sw; // sw의 값을 푸시
					ptr++;
					no = no - 1;
					x = 6 - x - y;
					if (++sw == 2)
						sw = 0;
					continue;
				}
				do {
					if (ptr-- == 0) // 스택이 텅 빔
						return;
					x = xstk[ptr]; // 값을 저장하고 있는 x를 팝
					y = ystk[ptr]; // 값을 저장하고 있는 y를 팝
					sw = sstk[ptr] + 1; // 값을 저장하고 있는 sw를 팝
					no++;
				} while (sw == 2);
			}
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("하노이의 탑 원반의 개수");
			int n = sc.nextInt();
			
			//1번 기둥의 n개의 원반을 3번 기둥으로 옮김
			move(n, 1, 3);
		}
}
