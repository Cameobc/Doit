package com.doit.recursive;

import java.util.Scanner;

public class Recursive04 {

	//6에서 빼는 이유 -> 기둥이 3개(1, 2, 3)
		//3기둥의 합이 6이므로 시작 기둥, 목표 기둥이 어느 기둥이라도 중간 기둥은 6-x-y로 구할 수 있음
		static void move(int no, int x, int y) {
			if(no>1) {
				move(no-1, x, 6-x-y);
			}

			System.out.println("원반["+no+"]를 "+x+"기둥에서 "+y+" 기둥으로 옮김");
		
			if(no>1) {
				move(no-1, 6-x-y, y);
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
