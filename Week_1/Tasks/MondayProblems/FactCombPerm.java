package com.Revature.dayone;

import java.util.Scanner;

public class FactCombPerm {
	
	public static int factorial(int n) {
        //1
        int eF = 1;
        //2
        for (int i = 1; i <= n; i++) {
            //3
            eF = eF * i;
        }
        
        //System.out.println(" = " +eF);
        
        //4
        return eF;
    }
	
	public static void main(String[] args) {
		int n, r;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a value for n: ");
		n = scan.nextInt();
		
		int eF = 1; //Starting from 1 going to 10 factorial
		
		System.out.print("Factorial is: ");
		
		for(int i = 1; i <= n; ++i) {
			
			eF = eF * i;
			
			if(n == i)
				System.out.print(i);
			else
				System.out.print(i + " * ");
		}
		
		System.out.println(" = " +eF);
		
		System.out.println("Enter a value for r: ");
		r = scan.nextInt();
		
		int nCr = (factorial(n) / (factorial(n-r) * factorial(r)));
		int nPr = (factorial(n) / (factorial(n - r)));
		
		System.out.println("Combination: nCr = " +nCr);
		System.out.println("Permutation: nPr = " +nPr);
	}
}
