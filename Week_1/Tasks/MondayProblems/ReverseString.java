package com.Revature.dayone;

import java.util.Scanner;

public class ReverseString {

	
	public static void main(String[] args) {
		//char array1[] = new array[];
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = in.nextLine();
		
		for(int i=0; i < s.length(); --i) {
			char c = s.charAt(2);
			System.out.println(c);
		}
		
	}
}
