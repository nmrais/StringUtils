package com.rais.string.utils;


public class StringUtils {
	/**
	 * This method returns the intersection of two ArrayList items.
	 * For e.g. list1 is {a, b, c} and list2 is {b, c, d, e}, then
	 * intersection operation returns {b, c}
	 * In order words, it returns those elements common to both.
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static boolean isPalindrome(String input){
		if (input == null) {
	        return false;
		}
	    StringBuilder strBuilder = new StringBuilder(input);
	    strBuilder.reverse();
	    return strBuilder.toString().equals(input);
	}

}
