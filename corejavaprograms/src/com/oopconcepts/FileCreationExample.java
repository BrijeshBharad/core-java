package com.oopconcepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreationExample {

	public static void main(String[] args) {
		File fileCreationObject = new File("G:\\ff\\newfile2.txt");
		try {
			if (fileCreationObject.createNewFile()) {
				System.out.println("file created: " + fileCreationObject.getName());
			} else {
				System.out.println("file already exists");
			}
		} catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	}

}
