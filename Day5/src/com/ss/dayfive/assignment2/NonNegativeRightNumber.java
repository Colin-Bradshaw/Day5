/**
 * 
 */
package com.ss.dayfive.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
		
		List<Integer> l2 = l1.stream().map((n) -> {
			// remainder division until 1 digit long
			while(n > 10) {
				n %= 10;
			}
			return n;
			// collect to list
		}).collect(Collectors.toList());
		
		System.out.println(l2.toString());
	}

}
