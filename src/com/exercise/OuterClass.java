package com.exercise;

public class OuterClass {

	public static class NestedStaticClass{
		public void printMessage(){
			System.out.println("Mesaage from nested static class.");
		}
	}
	
	public class NonstaticNestedClass{
		public void printmessage(){
			System.out.println("Message from non static nested class.");
		}
	}
	
	public static void main(String[] args) {
		OuterClass.NestedStaticClass staticClass = new OuterClass.NestedStaticClass();
		staticClass.printMessage();
		
		
		OuterClass outer =new OuterClass();
		OuterClass.NonstaticNestedClass nonstaticnested=outer.new NonstaticNestedClass();
		nonstaticnested.printmessage();
		
	}
	
}
