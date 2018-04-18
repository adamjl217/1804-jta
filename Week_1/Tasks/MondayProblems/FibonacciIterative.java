package com.Revature.dayone;

public class FibonacciIterative {

	public static void main(String[] args) {
		
		int fPrev1 = 0, fPrev2 = 1, fN = 0, count = 10; //Count could be any variable
		
		System.out.print(fPrev1+ " " +fPrev2); //Base case of f0 and f1
		
		for(int i = 1; i < count; ++i) {
			fN = fPrev1 + fPrev2;
			System.out.print(" " + fN);
			fPrev1 = fPrev2; //Update 2 previous numbers for next step of sequence
			fPrev2 = fN;
		}
		
	}
}
