package com.BridgelabcomAssignmentDay2;
/*
 * Author: Prasad
 * 
 */
import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
	 double x,y,d;
	 System.out.println("Enter the distance x and y from origin");
	 Scanner sc = new Scanner(System.in);
	 x = sc.nextDouble();
	 y = sc.nextDouble();
	 d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	 System.out.println(d);
	}
}
