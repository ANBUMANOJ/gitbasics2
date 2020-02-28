package com.test.org;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
	public static void main(String[] args) { 
		String [] names = {"anbu","sowmiya","raj","pooja","manjunath","dinesh","anbu","jeeva","raj","harini"};
		for(int i=0;i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
					if(names[i].equals(names[j])) {
						System.out.println("duplicate element is:::" +names[i]);
			}
		}
		}
		System.out.println("@@@@@@@");
 	Set<String> e=new HashSet<String>();
	for(String name:names) {
		if(e.add(name)== false) {
			System.out.println("duplicate element is:::" +name);
		}
	}
        }
	}