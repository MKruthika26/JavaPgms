package com.basic;

public class StirngSubStrLongestPalindromePart3 {
	public static String rev(String s) {
		String res="";
		for(int i=s.length()-1; i>=0; i--) {
			res+=s.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=("malayalam");
		String l_str="";
		int max_len=0;
		for(int i=0; i<s.length(); i++) {
			for (int j=i; j<s.length(); j++) {
				String res="";
				for(int k=i; k<=j; k++) {
					res += s.charAt(k);		
				}
				if(res.equals(rev(res))) {
					if(res.length()>max_len) {
						l_str=res;
						max_len=res.length();
					}
					 
				}
			}
		}
		System.out.println(l_str);
		System.out.println(max_len);
	}

}
