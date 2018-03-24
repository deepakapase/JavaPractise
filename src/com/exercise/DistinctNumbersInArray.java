package com.exercise;

import java.util.HashSet;
import java.util.Iterator;

public class DistinctNumbersInArray {

	public static void distinctNumbers(int[] nums) {
		
		HashSet<Integer >set=new HashSet<Integer>();
		boolean isAdded = true;
		for(int i=0;i<nums.length;i++){
			
			if(!set.add(nums[i])){
				System.out.println("Duplicate num "+nums[i]);

			}		}
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

//		for(int i=0;i<nums.length;i++){
//			boolean isDistinct=false;
//			for(int j=0;j<i;j++){
//				if(nums[i] == nums[j]){
//					isDistinct = true;
//					break;				
//				}
//			}
//			if(!isDistinct){
//				System.out.println(nums[i]);
//			}
//
		
	}

	public static void main(String[] args) {
		int[] numbers = new int[] { 5, 4, 5, 4,6, 7, 8, 8,9 };
		distinctNumbers(numbers);

	}

}
