package com.basic;

public class RecursionArmstrong {
	public static int r_countdigit(int num,int count) {
		if(num==0) {
			return count;
		}
		return r_countdigit(num/10, count+1);
	}
	public static int rec_arm(int num, int res, int digit) {
		if (num==0) {
			return res;
		}
		return rec_arm(num/10, res+(int)Math.pow(num%10, digit), digit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int count =0;
		int digit = r_countdigit(num, count);
		int res= rec_arm(num, 0, digit);
		if(num==res) {
			System.out.println("armstrong");
		}else {
			System.out.println("its not");
		}
	}

}
