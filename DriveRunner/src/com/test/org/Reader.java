package com.test.org;

import java.io.File;

public class Reader {
	
	public static void main(String[] args) {
		
		File f=new File("D:\\");
		
		String[] f1=f.list();
		
		for (String x1: f1) {
			
			System.out.println(x1);
		}
	}
}
