package com.exercise;

public class CompressString {

	
	public static void compressString(String str){
		int count=0;
		char temp=str.charAt(0);
		for(int i=0; i<str.length(); i++){
			if(temp == str.charAt(i)){
				count++;
			}else{
				System.out.print(temp+""+count);
				count=1;
				temp=str.charAt(i);
			}
		}
		System.out.print(temp+""+count);

	}
	public static void main(String[] args) {
		compressString("aaabbccd");
	}
}
