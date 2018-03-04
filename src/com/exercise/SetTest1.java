package com.exercise;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {

	
	public static void main(String[] args) {
		int [] nums= new int[]{12,11,14,15,12,34};
		Set numbers=new HashSet<>();
		for(int i=0;i<nums.length;i++){
			numbers.add(nums[i]);
			System.out.println(nums[i]);
		}
		System.out.println("set "+numbers);

	}
}
