package com.exercise;

import java.util.ArrayList;
import java.util.StringTokenizer;

import org.junit.internal.runners.model.EachTestNotifier;

public class PrintNumbers {

	public static void main(String[] args) {
//		boolean res=isStringContains("abcdefgh", "efqgh");
//		System.out.println("Result "+res);
		ArrayList<String> wordList=new ArrayList<String>();
		wordList=printAllWords("My name is Deepa. I am from India. I am from pune");
		for (String word : wordList) {
			System.out.println(word);

		}
	}

	public void printEvenNumbers(){
	for(int i=1;i<10;i++){
//		if(i%2==1)
//			continue;
		if(i%2==0){
			System.out.println("Even number "+i);
		}
		}
	}
	public static void hiHelloPrint(int n) {

		for (int i = 1; i <= n; i++) {
			 if (i % 5 == 0) {
					System.out.println("HiHello");
				}
			if (i % 2 == 0) {
				System.out.println("Hi "+i);
			} else if (i % 2 == 1) {
				System.out.println("Hello "+i);
			}		}

	}
	
	public static void lengthString(String str){
		if(str == null) return;
		System.out.println(str.length());
		
	}
	
	public static boolean isEqualStr(String str1,String str2){
		if(str1 == null && str2 == null) {
			return true;
		}
		if(str1 == null || str2 == null) {
			return false;
		}
		return str1.trim().equalsIgnoreCase(str2.trim()); 
		
	}
	
	public static boolean isStringContains(String str1,String str2){
		if(str1 == null && str2 == null) {
			return false;
		}
		if(str1 == null || str2 == null) {
			return false;
		}
		
		return str1.indexOf(str2)>=0;
	}

	public static void printMatrix(int rows,int cols){
		//3
		int count=0;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=cols;j++){
				count++;
				System.out.print(count+" ");
			}
			System.out.println(" ");
		}
	}
	
	//Print all words in given string.words are separated by space.
	
	public static  ArrayList<String> printAllWords(String str1){
		
		StringTokenizer token=new StringTokenizer(str1," ");
		ArrayList<String> wordsList=new ArrayList<String>();
		while(token.hasMoreTokens()){
			//System.out.println(""+token.nextToken());
			wordsList.add(token.nextToken());
			 
		}
		return wordsList;
	}
	//Return all words from the given string words are separated by space.
}
