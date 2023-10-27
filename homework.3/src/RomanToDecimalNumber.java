/*
 * Given a roman numeral, convert it to an integer.
 * I=1, V=5, X=10, L=50, C=100, D=500, M=1000
 * 
 * Some examples:
 * I=1, II=2, III=3, IV=4 (5-1), V=5, VI=6 (5+1), VII=7 (5+2), VIII=8 (5+3), IX=9 (10-1)
 */

import java.util.Scanner;

public class RomanToDecimalNumber {

	private static Scanner input;

	public static void main(String[] args) {

		String roman;
		input = new Scanner(System.in);
		System.out.print("Input: ");
		roman = input.nextLine();
		int decimal = 0;

		for (int i = 0; i < roman.length(); i++) {
			// If the current character is greater than the previous character, we need to subtract the previous character
			if (i > 0 && value(roman.charAt(i)) > value(roman.charAt(i - 1))) {
				// We need to subtract twice the value of the previous character because we added in the else statement
				decimal += value(roman.charAt(i)) - 2 * value(roman.charAt(i - 1));
			} // Otherwise, we just add the value of the current character
			else {
				decimal += value(roman.charAt(i));
			}
		}

		// Print the result
		System.out.println("Output: " + decimal);

	}
	
	public static int value(char roman) {
		switch (roman) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;	
		case 'L':
			return 50;	
		case 'C':
			return 100;	
		case 'D':
			return 500;	
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

}
