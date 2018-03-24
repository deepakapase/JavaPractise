 package com.exercise;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicatecharInString {

	
	public static void getDuplicatechars(String word){
		char[] wordChars= word.toCharArray();	
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		int count=0;
		for (char ch : wordChars) {
			if(map.containsKey(ch)){
				count=map.get(ch);
				map.put(ch, count+1);
			}else{
				map.put(ch, 1);
			}
		
		}
		 for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"____"+entry.getValue());
		}
	}

	public static void main(String[] args) {
		getDuplicatechars("deepa");
	}
}
