package com.basic;

public class Recursion {
	public static void Rmethod(int num) {
		if(num==0) {
			System.out.println(num);
			return;
		}
		System.out.println(num);
		Rmethod(num-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		Rmethod(num);
		

	}

}
