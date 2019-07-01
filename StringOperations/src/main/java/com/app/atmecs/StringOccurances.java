package com.app.atmecs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Class in which find no of occourances of alpahbet, digit, and special charcters.
 * Uses Pattern matcher using regex to find particular occourance.
 */
public class StringOccurances {

	public static void main(String[] args) {
		
		//Regex pattern for alphabet, special chars, and digit.
		final String special_charcter_pattern= "[$&+,:;=\\\\\\\\?@#|/'<>.^*()%!-]";
		final String alphabet_pattern= "[a-zA-Z]";
		final String digit_pattern= "[0-9]";
		
		String input_String;
		
		//Declare pattern and matcher class
		Pattern pattern=null;
		Matcher matcher=null;
		
		//Accepting input from user on which operation going to perform
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input string: ");
		input_String=sc.next();
		
		//Printing alphabet from user input
		System.out.println("Total no of alphabet in string :"+pattern_matching(pattern, matcher, input_String, alphabet_pattern));
		
		//Printing digit from user input
		System.out.println("Total no of digit in string :"+pattern_matching(pattern, matcher, input_String, digit_pattern));
	
		//Printing special characters from user input
		System.out.println("Total no of special charcters in string :"+pattern_matching(pattern, matcher, input_String, special_charcter_pattern));
				
		sc.close();
		
	}
	
	public static int pattern_matching(Pattern pattern, Matcher matcher, String input_string, String string_pattern) {
		int count = 0;

		pattern=Pattern.compile(string_pattern);
		matcher=pattern.matcher(input_string);

		while(matcher.find()) {
			count=count+1;
			System.out.println("position "  + matcher.start() + ": " + input_string.charAt(matcher.start()));	
		}
		return count;

	}
	
}
