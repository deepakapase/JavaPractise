package com.exercise;

public class Fibonaaci {

	//0 1 1 2 3 5 8 13 21
	
	public static void main(String[] args) {
		fibonacci(20);
	}
	
	public static void fibonacci(int n){
		int a = 0;
		int b = 1;
		int[] fib =new int[n];
		fib[0] = 0;
		fib[1] = 1;
		System.out.print(a+" "+b);
		for(int i=2;i<n;i++){
			fib[i] = fib[i-1] + fib[i-2];
			System.out.print(" "+fib[i]);
		}
		System.out.println();
	}
	
	// f(n)= f(n-1) + f(n-2)
	
	public static int recFib(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		int fib = recFib(n-1) + recFib(n-2);
		System.out.println(fib);
		return fib;
	}
}
