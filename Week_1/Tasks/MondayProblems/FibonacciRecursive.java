package com.Revature.dayone;

public class FibonacciRecursive {
	
	static int fPrev1 = 0, fPrev2 = 1, fN = 0;
	
	static void printFibonacci(int n) {
			// Do until the nth number
			if(n > 0) {
				fN = fPrev1 + fPrev2; // 1st previous num + 2nd previous num
				fPrev1 = fPrev2; 	  // Update
				fPrev2 = fN;		  // Update
				System.out.print(" " + fN); //Print current step
				printFibonacci(n-1); //Next step
			}
		}
	
	public static void main(String[] args) {
		int  n = 10; //Could be any value for N
		System.out.print(fPrev1+ " " +fPrev2); //Base case f0 and f1
		printFibonacci(n-2); // Start the sequence
	}
}
