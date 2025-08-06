package com.basic;

public class ArrSubArraySizeEqK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {21,-5,-22,5,9,-34};
		int a=2;
		int start=0;
		int end=0;
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int sum=0;
				int len=0;
				for(int k=i; k<=j; k++) {
					sum+=arr[k];
					len++;
				}
				if(sum>max && len==a) {
					max=sum;
					start=i;
					end=j;
				}
			}
		}
		System.out.println(max);
		for(int i=start; i<=end; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
