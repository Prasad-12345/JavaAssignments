package com.BridgelabcomAssignmentday1;
/*
 * Author: Prasad
 * Program to sum the command line arguments
 */
public class SumCommandArg {
	public static void main(String[] values) {
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += Integer.parseInt(values[i]);
		}
		System.out.println("The sum of command line arg is" + sum);
	}

}
