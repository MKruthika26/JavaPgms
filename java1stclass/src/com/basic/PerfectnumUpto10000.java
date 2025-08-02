package com.basic;

public class PerfectnumUpto10000 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		for(int num=1; num<=10000;num++) {
			int sum=0;
			for (int i=1; i<num; i++) {
				if(num%i==0) {
					sum+=i;
				}
			}
			if(sum==num) {
				System.out.println(num);
			}
		}

	}

}
