package com.oopconcepts;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("G:\\newfile.txt");
			fileWriter.write("File in Java");
			fileWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
}