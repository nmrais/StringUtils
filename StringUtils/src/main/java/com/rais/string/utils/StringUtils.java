package com.rais.string.utils;

import java.util.Arrays;


public class StringUtils {
	/**
	 * This method returns true if the String provided is a palindrome.
	 * i.e The reverse of the string is the same as the string.
	 * For e.g. NOON returns true and it's reverse is also NOON.
	 * @param input
	 * @return boolean
	 */
	public static boolean isPalindrome(String input){
		if (input == null) {
	        return false;
		}
	    StringBuilder strBuilder = new StringBuilder(input);
	    strBuilder.reverse();
	    return strBuilder.toString().equals(input);
	}

	/**
	 * This method returns true if "anagram" is anagram of "word".
	 * There is an additional functionality. you can make it case insensitive.
	 * if isCaseSensitive boolean is set to True, then it would take the case 
	 * also into consideration while checking the equality.
	 * Anagrams are those words which share the same letters.
	 * For e.g.  mary and army are anagrams.
	 * @param word
	 * @param anagram
	 * @param isCaseSensitive
	 * @return boolean
	 */
	public static boolean isAnagram(String word, String anagram, boolean isCaseSensitive) {
		if(!isCaseSensitive){
			word = word.toLowerCase();
			anagram = anagram.toLowerCase();
		} 
		char[] charFromWord = word.toCharArray(); 
		char[] charFromAnagram = anagram.toCharArray(); 
		Arrays.sort(charFromWord); 
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);
	}
}
