package com.basic;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hcf=1;
		int n1=12;
		int n2=18;
		int min=(n1<n2)?n1:n2;
		for(int i=1; i<=min; i++) {
			if(n1%i==0 && n2%i==0) {
				hcf=i;
			}
		}
		System.out.println(hcf);

	}

}
