package com.exercise;

import java.util.HashSet;
import java.util.Iterator;

public class CommonElementsInArray {

public static void commonElements(int [] arrayElements){
/*for(int i=0; i < arrayElements.length; i++){
	boolean isCommon= false;
	for(int j = 0; j <i ; j++)	{
		if(arrayElements[i] == arrayElements[j]) {
			isCommon = true;
			break;
		}
	}
	if(isCommon){
		System.out.println(arrayElements[i]);
	}
	
	}
	*/
	
	HashSet<Integer> set =new HashSet<Integer>();
	for(int i=0 ; i< arrayElements.length; i++){
		set.add(arrayElements[i]);
	}
	Iterator it = set.iterator();
	while(it.hasNext()){
		
	}


}

	public static void main(String args[]) {
		int[] arrayNums = new int[] { 67, 78, 88, 67, 56,56 };
		commonElements(arrayNums);
	}

}