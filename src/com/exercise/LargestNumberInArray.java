package com.exercise;

public class LargestNumberInArray {

	
	public static void getLargestNumber(int[] numbers){
		int max=numbers[0];
		for (int i=1 ;i<numbers.length; i++) {
			if(max < numbers[i]){
				max=numbers[i];
			}
		}
		System.out.println(" largest number in array "+max);

	}
	
	public static void main(String[] args) {
		
		int[] nums= new int []{100,22,3,4,5};
		for (int i=0 ;i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println("");
		getLargestNumber(nums);
	}
}
