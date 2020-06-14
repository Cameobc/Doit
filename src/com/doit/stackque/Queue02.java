package com.doit.stackque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue02 {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(
					new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int c = Integer.parseInt(st.nextToken());
			int n; //문서의 개수
			int m; //찾을 문서의 인덱스
			LinkedList<Integer> queue;
			for(int i=0;i<c;i++) {
				st = new StringTokenizer(bf.readLine());
				n = Integer.parseInt(st.nextToken());
				m = Integer.parseInt(st.nextToken());
				int result=0; //결과?
				queue= new LinkedList<Integer>();
				st = new StringTokenizer(bf.readLine());
				for(int j=0;j<n;j++) {
					queue.offer(Integer.parseInt(st.nextToken()));
					//queue.add(Integer.parseInt(st.nextToken()));
				}
//				boolean check =true;
//				int k=m+1;
//				while(k!=m) {
//					
//				}
				
				for(int k=m;k<n;k++) {
					if(queue.get(m)<queue.get(k)) {
						//queue.poll();
						result++;
					}
				}
				
				for(int k=0;k<m;k++) {
					if(queue.get(m)<=queue.get(k)) {
						result++;
					}
				}	
				System.out.println(result);
			}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}
