package com.exercise;

import org.testng.xml.ISuiteParser;

public class StringFunctions {

	
	public static void main(String[] args) {
		//System.out.println(isPalindrome("bgt"));
		//reverseString("deepa");
		//System.out.println(revString("THANKS Deepali"));
		String str = "hey how are you?";
		System.out.println(isSubstring(str));
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
	
	public static void reverseString(String str){
		String revStr = "";
		char[] charArray = str.toCharArray();
		for(int i=str.length()-1; i>=0; i--){
			revStr += charArray[i];
		}
		System.out.println(revStr);

		
	}
	
	public static String revString(String str){
		char[] letters = str.toCharArray();
		int size = letters.length-1;
		for(int i =0 ;i<letters.length/2;i++){
			char temp = letters[size-i];
			letters[size-i] = letters[i];
			letters[i] = temp;
		}
		
		return  new String(letters);
	}
	
	public static boolean isSubstring(String str1){
		
//		if(str1.contains("howq")){
//			return true;
//		}
//		return false;
		
		
		if(str1.indexOf("how") == -1){
			return false;
		}
		return true;
	}
	
	public static void removeCharFromString(String str,char ch){
		
		char[] chars = str.toCharArray();
	}
}



