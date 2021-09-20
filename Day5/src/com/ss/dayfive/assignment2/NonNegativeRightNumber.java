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
		RightmostDigit rd = (i) ->{
			ArrayList<Integer> ret = new ArrayList<Integer>();
			for(Integer j: i) {
				int k = j.intValue();
				while(k > 10) {
					k %= 10;
				}
				ret.add(k);
			}
			return ret;
		};
		
		for(int z: rd.rightmostDigit(l1)) {
			System.out.println(z);
		}

	}

}
