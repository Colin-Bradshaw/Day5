/**
 * 
 */
package com.ss.dayfive.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		RemoveX rx = (i) ->{
			ArrayList<String> ret = new ArrayList<String>();
			for(String s: i) {
				String store = "";
				store = s.replace("X", "");
				store = store.replace("x", "");
				ret.add(store);
			}
			return ret;
		};
		for(String s: rx.removeX(l1)) {
			System.out.println(s);
		}
	}

}
