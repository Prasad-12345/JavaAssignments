package com.BridgelabcomAssignmentDay2;
/*
 * Author: Prasad
 * Program for the sum of n natural numbers using while loop
 */
import java.util.Scanner;

public class SumOfNaturalWhile {
	public static void main(String[] args) {
		int n,i=0,sum=0;
		System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (i<=n) {
        	sum = sum + i;
        	i++;
        }
        System.out.println(sum);
	}

}
