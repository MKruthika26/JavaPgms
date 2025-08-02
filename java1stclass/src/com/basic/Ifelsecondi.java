package com.basic;

public class Ifelsecondi {
	public static void main(String [] args) {
		int per= 90;
		if(per>85) {
			System.out.println("distinction");
		}
		if(per>60) {
			System.out.println("first");
		}
		if(per>45) {
			System.out.println("second");
		}
		if(per>35) {
			System.out.println("just pass");
		}
		if(per<35) {
			System.out.println("fail");
		}
		
		int a=65;
		if(a>85) {
			System.out.println("distinction");
		}
		else if(a>60) {
			System.out.println("first");
		}
		else if(a>45) {
			System.out.println("second");
		}
		else if(a>35) {
			System.out.println("just pass");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
