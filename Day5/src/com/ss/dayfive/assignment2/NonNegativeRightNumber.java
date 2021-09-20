/**
 * 
 */
package com.ss.dayfive.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Colin Bradshaw
 *
 */
public class NonNegativeRightNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(11, 124, 1, 35895);
		
		l1.stream().forEach(n -> {
			while(n > 10) {
				n %= 10;
			}
			System.out.println(n);
		});

	}

}
