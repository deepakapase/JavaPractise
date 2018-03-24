package com.exercise;

import java.util.Arrays;

public class IsAnagramUsingMap {

	
	public static boolean isAnagram (String str1, String str2){
	
		boolean status = false;
		char[] charArray1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
		char[] charArray2 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(charArray1.length != charArray2.length){
			status=false;
		}
		
		status = Arrays.equals(charArray1, charArray2);
		if(status){
			System.out.println(str1+" and "+str2+" are anagrams");
		}else{
			System.out.println(str1+" and "+str2+" are not anagrams");
		}
		
		return status;
	}
	
	public static void main(String[] args) {
		String str = "Java is great programming language ";
		//str=str.replaceAll("\\s", "%20");
		System.out.println(str);
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
		
	}

}
