package com.basic;

public class Palindromeupto10000 {

	public static int reverse(int num) {
		int res=0;
		while(num!=0) {
			int rem= num%10;
			res=(res*10)+rem;
			num/=10;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k=1; k<=10000; k++) {
			int num =k;
			int res= reverse(num);
			if(num==res) {
				System.out.println(num);
			}
		}
		
	}

}
