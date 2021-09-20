/**
 * 
 */
package com.ss.dayfive.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Colin Bradshaw
 *
 */
public class DoubleLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// given list of Integers
		List<Integer> l1 = Arrays.asList(2, 7, 12, 24);

		List<Integer> l2 = l1.stream().map((n) -> {
			// multiply by 2, return
			n *=2;
			return n;
			//then collect as a list
		}).collect(Collectors.toList());
		// print
		System.out.println(l2.toString());
	}

}
