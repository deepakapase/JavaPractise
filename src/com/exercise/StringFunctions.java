package com.exercise;

import org.testng.xml.ISuiteParser;

public class StringFunctions {

	
	public static void main(String[] args) {
		System.out.println(isPalindrome("anittina"));
	}
	
	public static boolean isPalindrome(String word){
		
		char[] char_Array=word.toCharArray();
		for(int i=0; i<char_Array.length/2; i++){
			int j = (char_Array.length-1)-i;
			if(char_Array[i] != char_Array[j]){
				System.out.println(char_Array[i]+" ---- "+ char_Array[j]);
				return false;
			}
		}
		return true;
	}
}