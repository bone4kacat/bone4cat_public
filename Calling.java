package com;

public class Calling
{

	static Tab cls=new Tab();
	
	public static void main (String[] args) {
		printOne();
		printOne();
		printTwo();
	}
	
	public static void printOne() {
		System.out.println("Try 2");
	}
	
	public static void printTwo() {
		printOne();
		printOne();
		
		
	}
	
}
