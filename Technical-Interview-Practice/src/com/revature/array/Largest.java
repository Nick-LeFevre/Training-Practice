package com.revature.array;

import java.util.Arrays;

public class Largest {
	
	public static int Largest(int[] a, int total) {
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		return a[total-1];
			
		
	}
	
	public static void main(String[] args) {
		
		int [] a = {2, 6, 90, 1, 91, 100, 0 ,89, 99};
		
		System.out.println(Largest(a,9));
		
	}

}
