package com.exercise;

import java.util.HashMap;

import java.util.Map.Entry;


public class WordCount {
	
	
	

	public static void main(String[] args) {
	 String str="Page Page Model is a Design Pattern Design has become popular in page Test Automation.";
	 String [] strArr=str.split(" ");
	 int count=1;
	 HashMap<String,Integer> map=new HashMap<String,Integer>();
	 for (String word : strArr) {
		 if(map.containsKey(word)){
			count=map.get(word);
			map.put(word, count+1);
		 }else{
			 map.put(word, 1);		 

		 }
	}
	
	 for (Entry<String, Integer> entry : map.entrySet()) {
		System.out.println(entry.getKey() + ": " + entry.getValue());
	}
	}

}
