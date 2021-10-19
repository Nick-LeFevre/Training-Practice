package com.revature.EvenOdd;

import java.util.Scanner;

public class Number {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		
		int num;
		
		num = scan.nextInt();
			
		if(num % 2 == 0) {
			System.out.println("The number is Even");
		}else {
			System.out.println("The number is Odd");
		}
		
		
	}

}
