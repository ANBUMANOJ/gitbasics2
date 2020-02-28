package com.test.org;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
	
	public static void main(String[] args) {
		int[]a= {10,60,20};
		List<Integer>m=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			m.add(a[i]);
		}
		System.out.println(m);
	}
}
