package com.BridgelabcomAssignmentDay2;
/*
 * Author: Prasad
 * Program to read number 1,10,100,1000 and display unit,ten,hundred 
 * and thousand
 */
import java.util.Scanner;

public class Display {
	public static void main(String[] args) {
		int a;
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();		
        if ( a == 1 ) {
        System.out.println("Unit"); 	
        }
        else if ( a == 10 ) {
        System.out.println("Ten");	
        }
        else if ( a == 100 ) {
            System.out.println("Hundred");	
            }
        else if ( a == 1000 ) {
            System.out.println("Thousand");	
            }
	}
}
