/**
 * 
 */
package com.ss.dayfive.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Colin Bradshaw
 *
 */
public class NoX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("Saxaphone", "Xtol", "reprieve", "XxX");
		
		List<String> l2 = l1.stream().map((s) -> {
			// replace both cases of 'x'
			s = s.replace("X", "");
			s = s.replace("x", "");
			return s;
			// collect to list
		}).collect(Collectors.toList());
		// print
		System.out.println(l2.toString());
				
	}

}
