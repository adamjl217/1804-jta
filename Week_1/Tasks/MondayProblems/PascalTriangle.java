package com.Revature.dayone;

import java.util.Scanner;

public class PascalTriangle {

	public static void computeRow(int n) {
		for(int i = 0; i < n; i++) {
			if(i == n - 1) {
				for(int j = 0; j <= i; j++)
					System.out.print(pascalValue(i, j) + " ");
			}
		}
		System.out.println();
	}
	
	public static int pascalValue(int i, int j) {
		if(j == 0)
			return 1;
		else if(j == i)
			return 1;
		else
			return pascalValue(i - 1, j - 1) + pascalValue(i - 1, j);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row for Pascal's Triangle: ");
		int row = sc.nextInt();
		System.out.print("Line " + row + " of Pascal's Triangle:\n");
		computeRow(row);
		sc.close();
	}
}
