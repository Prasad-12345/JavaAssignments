package com.BridgelabcomAssignmentDay2;
/*
 * Author: Prasad
 * Program to reverse the integer number using for loop
 */
import java.util.Scanner;

public class ReverseIntFor {
	public static void main(String[] args) {
		int a,rem,rev=0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		for (;a>0;) {
		rem = a % 10;
		rev = rev*10 + rem;
		a = a/10;
		}
        System.out.println(rev);
	}
}
