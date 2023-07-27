package com.OopConcepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreationExample {

	public static void main(String[] args) {
		File Obj = new File("G:\\ff\\newfile2.txt");
		try {
			if (Obj.createNewFile()) {
				System.out.println("file created: " + Obj.getName());
			} else {
				System.out.println("file already exists");
			}
		} catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}

		

	}

}
