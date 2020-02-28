package com.test.org;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementSet {
	public static void main(String[] args) {
		String [] names = {"anbu","sowmiya","raj","pooja","manjunath","dinesh","anbu","jeeva","raj","harini"};
		Set<String> value=new HashSet<>();
		for(String name:names) {
		if(	value.add(name)==false) {
			System.out.println("duplicate element is::"+ name);
		}
		}
	}

}
