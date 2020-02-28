package com.test.org;

public class LargestSmallestNumber {
	public static void main(String[] args) {
		int numbers[]= {-100, 90, -2020, 556, 3890,-904958, 84930};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			 if(numbers[i]>largest) {
				 largest=numbers[i];
			 }
			 else if(numbers[i]<smallest) {
				 smallest=numbers[i];
			 }
			 
		}
		System.out.println("Largest number is::"+largest);
		System.out.println("Smallest number is::"+smallest);
	}

}
