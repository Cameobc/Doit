package com.doit.stackque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack01 {

	
	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			int n =Integer.parseInt(bf.readLine()); //스택의 크기
			int i, temp, max=0, top=0;
			int[] stack = new int[n];
			while(n-->0) {
				temp = Integer.parseInt(bf.readLine()); //스택에 든 숫자
				
				if(temp>max) {
					for(i=max+1;i<=temp;i++) {
						stack[top++]=i;
						sb.append("+\n");
					}
					max = temp;
				}else if(stack[top-1]!=temp) {
					System.out.println("NO");
					return;
				}
				top--;
				sb.append("-\n");
			}
			System.out.println(sb);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
