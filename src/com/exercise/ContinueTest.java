package com.exercise;

import java.util.ArrayList;

public class ContinueTest {

	
	public static void main(String[] args) {
		ContinueTest ct= new ContinueTest();
		ContinueTest ct1= new ContinueTest();
		ContinueTest ct2= ct1;
		     //test
		System.out.println(ct.equals(ct1));
		System.out.println(ct1.equals(ct2));
		ArrayList<Integer> numbers= new ArrayList<>();
		ArrayList nums =new ArrayList();
		nums.add(1);
		numbers.add(2);
		for(int i=10;i<21;i+=2){
			
			if(i == 16)
				continue;
			System.out.println("i "+i);
		}
		for(int i=10;i<21;i++){
			if(i%2==1)
				continue;
			if(i==16)
				continue;
			System.out.println("i"+i);
			
			
		}
	}
}
