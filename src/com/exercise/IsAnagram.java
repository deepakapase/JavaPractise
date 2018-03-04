package com.exercise;

import java.util.Arrays;

public class IsAnagram {
	
	public static String str1="DORMITORY";
	public static String str2="Dirty Room";

	
	public static void isAnagram(String name1,String name2){
		boolean status=true;
		char[] char1=name1.toLowerCase().replaceAll("\\s", "").toCharArray();
		char[] char2=name2.toLowerCase().replaceAll("\\s", "").toCharArray();
		
		if(name1.length() != name2.length()){
			status=false;
		}
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		status=Arrays.equals(char1, char2);
		if(status){
			System.out.println(str1+" and "+str2+" are anagrams");
		}else{
			System.out.println(str1+" and "+str2+" are not anagrams");

		}
	}
	public static void main(String[] args) {

		isAnagram(str1,str2);
		
	}

}
