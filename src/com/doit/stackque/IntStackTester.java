package com.doit.stackque;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64); // 최대 64개를 푸쉬할 수 있는 스택
		
		while(true) {
			System.out.println("현재 데이터 수 :"+s.size()+" / "+s.capacity());
			System.out.println("(1)푸시  (2)팝  (3)피크  (4)덤프  (5)인덱스  "
					+ "(6)비우기  (7)용량  (8)데이터의 수  (9)비었는지  (10)가득찼는지  (0)종료");
			
			
			int menu = sc.nextInt();
			if(menu==0) {
				break;
			}
			
			int x;
			switch(menu) {
			case 1:
				System.out.println("데이터:");
				x=sc.nextInt();
				try {
					s.push(x);
				}catch (IntStack.OverflowIntStackException e) {
					System.out.println("full");
				}
				break;
			case 2:
				try {
					System.out.println(s.pop());
				}catch (IntStack.EmptyIntStackException e) {
					System.out.println("empty");
				}
				break;
			case 3:
				try {
					x=s.peek();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("empty");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				x=sc.nextInt();
				System.out.println("입력한 것과 일치하는 인덱스는"+s.indexOf(x));
				break;
			case 6:
				s.clear();
				break;
			case 7:
				System.out.println(s.capacity());
				break;
			case 8:
				System.out.println(s.size());
				break;
			case 9:
				System.out.println(s.isEmpty());
				break;
			case 10:
				System.out.println(s.isFull());
				break;
			}
		}
	}
}
