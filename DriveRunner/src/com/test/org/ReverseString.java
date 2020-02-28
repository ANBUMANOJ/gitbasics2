package com.test.org;

public class ReverseString {
	public static void main(String[] args) {
		String s="Hello Welcome To My World";
		int length=s.length();
		System.out.println(length);
		String reverse="";
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
			System.out.println(reverse);	
			
			String s1="Hello Welcome To My World";
			StringBuffer buf=new StringBuffer(s1);
			System.out.println(buf.reverse());
	}
	}
	

