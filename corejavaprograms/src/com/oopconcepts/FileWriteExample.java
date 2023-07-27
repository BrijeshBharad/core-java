package com.OopConcepts;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) {
		try {
			FileWriter ObjTwo = new FileWriter("newfile.txt");
			ObjTwo.write("i am brijesh bharad : 22 : java developes");
			ObjTwo.close();
			System.out.println("successfully wrote");
		} catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	}

}
