package com.doit.stackque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue01 {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(
					new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			/*int []num = new int[n];
			for(int i=0;i<num.length;i++) {
				num[i]=i+1;
			}*/
			LinkedList<Integer> deque = new LinkedList<Integer>();
			for(int i=1;i<=n;i++) {
				deque.add(i);
			}
			int m = Integer.parseInt(st.nextToken());
			int[] search = new int[m];
			st = new StringTokenizer(bf.readLine());
			for(int i=0;i<m;i++) {
				search[i]=Integer.parseInt(st.nextToken());
			}
			
			int result =0;
			for(int i=0;i<search.length;i++) {
				if(search[i]==deque.peek()) {
					deque.remove();
					continue;
				}
				
				if(deque.indexOf(search[i])<=deque.size()/2) {
					while(deque.peek() != search[i]) {
						int temp = deque.remove();
						deque.add(temp);
						result ++;
					}
				}else {
					while(deque.peek() != search[i]) {
						int temp = deque.get(deque.size()-1);
						deque.add(0, temp);
						deque.remove(deque.size()-1);
						result ++;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
