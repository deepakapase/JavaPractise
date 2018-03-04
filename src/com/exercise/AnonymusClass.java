package com.exercise;

public class AnonymusClass {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(" inside anonmus class");

			}
		});
		
		t.start();
		
		
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("inside anonmus thread class");
			}
		};
		t2.start();
		
	}


}

