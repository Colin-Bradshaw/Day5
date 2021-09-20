/**
 * 
 */
package com.ss.dayfive.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Colin Bradshaw
 *
 */
public class DoubleLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(2, 7, 12, 24);
		DoubleList dl = (i) -> {
			 ArrayList<Integer> ret = new ArrayList<Integer>();
			 for(Integer j: i) {
				 int k = j*2;
				 ret.add(k);
			 }
			 return ret;
		};
		
		for(int i:dl.doubleContents(l1)) {
			System.out.println(i);
		}
	}

}
