package com.exercise;

public class ForLoopTest1 {

	
	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			for(int j=3;j>0;j--){
				System.out.println(" "+i+" - "+j);

				if(i==j)
					continue;
				System.out.println("............ "+i+" - "+j);
			}
		}
	}
}
