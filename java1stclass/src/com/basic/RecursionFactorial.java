package com.basic;

public class RecursionFactorial {
	public static int r_fact(int num,int res) {
		if(num==0) {
			return res;
		}
		return r_fact(num-1,res*num);
	}
	public static void main(String[] args) {
		int res=r_fact(5,1);
		System.out.println(res);
	}

}
