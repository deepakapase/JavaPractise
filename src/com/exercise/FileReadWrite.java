package com.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	
	
	
	
	
	public static void main(String[] args) {
		readFile();
	}
	public static void readFile(){
		File file = new File("C:\\NewFiles\\FileTest.txt");
 		System.out.println(file.exists());
		try{
			boolean isFileCreated = file.createNewFile();
			System.out.println(isFileCreated+"  "+file.getName());
			FileWriter writeToFile = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(writeToFile);
			//writeToFile.write("New file is created. this is test file.");
			writer.write("New file is created. this is test file.");
			                                      
			writer.close();
			FileReader readFile =new FileReader(file);
			BufferedReader br =new BufferedReader(readFile);
			System.out.println(br.readLine());
			//readFile.read(in);
			//for (char c : in) {
			//	System.out.print(c);
			//}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
