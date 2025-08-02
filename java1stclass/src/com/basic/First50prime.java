package com.basic;

public class First50prime {

		public static int primefact(int n) {
			int count=0;
			for (int i=1; i<=n; i++) {
				if(n%i==0) {
					count++;
				}
			}
			return count;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int p_count=0;
			for(int k=1; k<=10000; k++) {
				int n=k;
				int count=primefact(n);
				if(count==2) {
					System.out.println(n);
					p_count++;
				}
				if(p_count==50) {
					break;
				}
			}
			
		}

}
