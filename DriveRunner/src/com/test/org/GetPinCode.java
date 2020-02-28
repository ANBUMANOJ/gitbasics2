package com.test.org;

public class GetPinCode {
	public static void main(String[] args) {
		String s="e-106,rajaji road,block-19,neyveli-607803";
		int s1=s.length();
		System.out.println(s1);
		String s2=s.substring(s.length()-6);
		System.out.println(s2);
	}
}
