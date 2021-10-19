package com.revature.array;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		
		int [] num = {1, -4, 3, -8, 0, 2, 8};
		
		System.out.println(Arrays.toString(num)); //print out the array list before sorting
		
		Arrays.sort(num); //sorting the list
		
		System.out.println(Arrays.toString(num)); //sorted array list
		
		
		//add the array together
		int sum = 0;
		
		for(int i : num) {
			sum += i;
		}
		
		System.out.println(sum);		
		
	}

}
