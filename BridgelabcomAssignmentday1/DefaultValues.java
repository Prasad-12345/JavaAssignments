package com.BridgelabcomAssignmentday1;
/*
 * Author: Prasad
 * Program to display the default values of all primitive data types
 */
public class DefaultValues {
	//variablr declaration
	int a;
	float b;
	double c;
	boolean d;
	long e;
	short f;
	byte g;
	char h;

	public static void main(String[] args) {
		//Object creation
		DefaultValues ob = new DefaultValues();
		
		System.out.println("Default value of int : " + ob.a);
		System.out.println("Default value of float : " + ob.b);
		System.out.println("Default value of double : " + ob.c);
		System.out.println("Default value of boolean : " + ob.d);
		System.out.println("Default value of long : " + ob.e);
		System.out.println("Default value of short: " + ob.f);
		System.out.println("Default value of byte : " + ob.g);
		System.out.println("Default value of char : " + ob.h);
	}
}
