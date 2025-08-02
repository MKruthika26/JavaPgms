package com.basic;

public class First100Avg {
	
	public static int Avg_num(int n) {
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
		float sum=0;
		for(int k=1; ; k++) {
			int n=k;
			int count=Avg_num(n);
			if(count==2) {
				sum+=n;
				p_count++;
			}
			if(p_count==100) {
				System.out.println(sum/100);
				break;
			}
		}

	}

}
