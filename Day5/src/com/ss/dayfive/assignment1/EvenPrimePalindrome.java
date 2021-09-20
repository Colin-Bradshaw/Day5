/**
 * 
 */
package com.ss.dayfive.assignment1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
/**
 * @author Colin Bradshaw
 *
 */
public class EvenPrimePalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String inputs = "5\n1 4\n2 5\n3 898\n1 3\n2 12\n";
		Scanner input = new Scanner(inputs);
		int loops = Integer.parseInt(input.nextLine());
		for(int i = 0; i < loops; i++) {
			String data = input.nextLine();
			System.out.println(data);
			int operation = Integer.parseInt(((Character)data.charAt(0)).toString());
			int num = Integer.parseInt(data.substring(2));
			
			switch (operation) {
			case 1:
				IsEvenOdd ev = (j) -> {
					return (j%2 == 0)?"EVEN":"ODD";
				};
				System.out.println(ev.isEven(num));
				break;
			case 2:
				IsPrime pr = (j) -> {
					boolean prime = true;
					for(int k = 2; k < Math.pow(j, 0.5); k++) {
						if(j%k == 0) {
							prime = false;
						}
					}
					return prime?"PRIME":"NOT PRIME";
				};
				System.out.println(pr.isPrime(num));
				break;
			case 3:
				IsPalindrome pal = (j) -> {
					String s = String.valueOf(j);
					boolean isPalindrome = true;
					for(int k = 0; k < (s.length() / 2) + 1; k++) {
						if(s.charAt(k) == s.charAt(s.length() - (k+1))) {
							// do nothing
						} else {
							isPalindrome = false;
						}
					}
					return isPalindrome?"PALINDROME":"NOT A PALINDROME";
				};
				System.out.println(pal.isPalindrome(num));
				break;
			default :
				System.out.println("Bad input for operation type");
			}
		}
	}

}
