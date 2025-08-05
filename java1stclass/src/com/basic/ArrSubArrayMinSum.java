package com.basic;

public class ArrSubArrayMinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {80,-10,-20,0,100,-30,-40,-50};
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int sum=0;
				for(int k=i; k<=j; k++) {
					sum+=arr[k];
				}
				if(sum<min) {
					min=sum;
				}
			}
		}
		System.out.println(min);

	}

}
