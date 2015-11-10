package com.test.rais.client;

import com.rais.string.utils.StringUtils;

public class StringUtilTest {
	public static void main(String[] hh) {
		String palindrome = "noon";
		String word="mary";
		String anagram = "Army";
		System.out.println("Is noon a palindrome? "+StringUtils.isPalindrome(palindrome));
		System.out.println("Are mary and Army anagrams? "+StringUtils.isAnagram(word, anagram, false));
		System.out.println("Are mary and Army anagrams? "+StringUtils.isAnagram(word, anagram, true));
	}
}
