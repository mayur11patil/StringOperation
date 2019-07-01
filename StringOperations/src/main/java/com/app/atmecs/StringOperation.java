package com.app.atmecs;

import java.util.Scanner;
/*
 * class in which accept string as user input and removes the delimiter from string
 */
public class StringOperation {
	
	public static void main(String[] args) {
		
		String inputString;
		String delimiterPattern;
		
		//Accepting input from user on which operation going to perform
		System.out.println("Enter the string Input:");
		Scanner sc = new Scanner(System.in);
		inputString = sc.next();
		
		//Accepting delimiter 
		System.out.println("Enter delimiter pattern");
		delimiterPattern = sc.next();
		
		System.out.println("Original String Input: "+inputString);
	
		System.out.println("After removal of delimiter: "+stringDelimiter(inputString, delimiterPattern));
	
		sc.close();
	}
	
	public static String stringDelimiter(String inputString, String delimiterPattern) {
	
		return inputString.replaceAll(delimiterPattern, " ");
	}

}
