/**
 * 
 */
package com.ss.dayfive.assignment5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Colin Bradshaw
 *
 */
public class RecursiveSumClump {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RecursiveSumClump rsc = new RecursiveSumClump();
		int[] test = {2, 5, 5, 5, 8};
		System.out.println(rsc.groupSumClump(rsc.identicalValues(test), 10));
		
	}
	
	// problem states a single loop may be used to identify the extent of consecutive duplicate values
	// this method modifies the provided array by replacing consecutive duplicate values with their sum
	public int[] identicalValues(int[] a) {
		int[] store = new int[a.length];
		// used to keep track of previous number
		Integer j = null;
		// index for storage array
		int index = 0;
		// adds consecutive duplicate values
		int accumulator = 0;
		// i indexes original array
		for(int i = 0; i < a.length; i++) {
			// add repeat numbers into the accumulator
			if(j != null && a[i] == j) {
				accumulator += j;
			} else {
				if(accumulator != 0) {
					// accumulator is off by multiple, fix it.
					accumulator += j;
					// index math
					index = index - (accumulator / j);
					// store in previous index... it currently holds the value of the number that repeats
					store[index] = accumulator;
					// reset
					accumulator = 0;
					index++;
				}
				// store current number
				store[index] = a[i];
			}
			j = a[i];
			index++;
		}
		// takes care of case where the last entries in the array are consecutive duplicates
		if(accumulator != 0) {
			// accumulator is off by multiple, fix it.
			accumulator += j;
			// index math
			index = index - (accumulator / j);
			// store in previous index... it currently holds the value of the number that repeats
			store[index] = accumulator;
			// increment index again for storage
			index++;
		}
		int[] retArr = new int[index];
		System.arraycopy(store, 0, retArr, 0, index);
		return retArr;
	}
	
	
	//complexity O(n!)
	public boolean groupSumClump(int[] noDuplicates, int target) {
		// add all values in the given array. If it adds to target, return true
		int store = 0;
		for(int i = 0; i < noDuplicates.length; i++) {
			store += noDuplicates[i];
			// slight optimization by checking in loop
			if(store == target) {
				return true;
			}
		}
		// if the above did not match the target, call self with all arrays that can be formed with one fewer element
		// [1,2,3] will call self with arrays [1, 2] [1, 3] [2, 3]
		if(noDuplicates.length > 0) {
			int[] recur = new int[noDuplicates.length -1];
			int missingIndex = 0;
			int index = 0;
			while(missingIndex < noDuplicates.length) {
				//build new array
				for(int i = 0; i < noDuplicates.length; i++) {
					if(i==missingIndex) {
						// do nothing
					} else {
						recur[index] = noDuplicates[i];
						index++;
					}
				}
				index = 0;
				missingIndex++;
				// recursive call
				if(groupSumClump(recur, target) == true) {
					return true;
				}
			}
		}
		// check if array is empty, if so, return false
		
		// base case
		return false;
	}
}
