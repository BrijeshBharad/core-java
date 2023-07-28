package com.oopconcepts;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) {
		try {
			FileWriter fileWriteObject = new FileWriter("newfile.txt");
			fileWriteObject.write("i am brijesh bharad : 22 : java developes");
			fileWriteObject.close();
			System.out.println("successfully wrote");
		} catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	}

}
