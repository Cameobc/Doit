package com.doit.stackque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack03 {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(
					new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			//stack -> max, pointer, stack
			//String[] s = new String[n];
			int a =0;
			int b=0;
			boolean check = true;
			
			while(n-->0) {
				Stack<Character> stc = new Stack<Character>();
				String s = bf.readLine();
				for(int i=0;i<s.length();i++) {
					if(i==0&&s.charAt(i)==')') {
						check = false;
						break;
					}
					
					stc.push(s.charAt(i));

					if(s.charAt(i)=='(') {
						a++;
					}
					if(s.charAt(i)==')') {
						b++;
					}
					if(a!=b-1) {
						check = false;
						break;
					}
				}
			}
			if(check) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	} 
}
