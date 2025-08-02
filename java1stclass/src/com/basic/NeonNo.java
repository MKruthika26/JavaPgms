package com.basic;
//neon number is a number where the sum of digits of a square of a number equal to the number.
//the task is to check the number is neon or not.
//eg: 9*9=81=> 8+1=9 therefore neon number.
// 12*12=144=> 1+4+4!= 12 therefore not a neon number.
public class NeonNo {
	public static int neon(int num) {
		int sum=0;
		while(num!=0) {
			int rem= num % 10;
			sum= sum+rem;
			num= num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9;
		int newno=num*num;
		int neon= neon(newno);
		if(neon==num) {
			System.out.println("neon");
		}else {
			System.out.println("not neon");
		}
	}

}
