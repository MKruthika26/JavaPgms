package com.basic;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =11011;
		int temp=num;
		int res=0;
		while(num>0){
			int rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
		if(temp==res) {
			System.out.println("its palindrome");
		}else {
			System.out.println("its not a palindrome");
		}
		System.out.println(res);

	}

}
