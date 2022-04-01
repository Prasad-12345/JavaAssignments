package com.BridgelabcomAssignmentday1;
/*
 * Author: Prasad
 * Program to demonstrate the static variables, methods and blocks
 */
public class DemoStatic {
	//static block
	static {
		System.out.println("We are in static block");
	}
	//static method
	static void method() {
		System.out.println("We are in static method");
	}
	//static variable
    static int a = 4;
	public static void main(String[] args) {
		System.out.println(a);
        method();
	}

}
