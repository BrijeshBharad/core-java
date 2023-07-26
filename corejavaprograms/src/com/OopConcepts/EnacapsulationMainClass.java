package com.OopConcepts;

public class EnacapsulationMainClass {

	public static void main(String[] args) {
		EncapsulationProgram obj = new EncapsulationProgram();
		obj.setRollNo(25);
		obj.setName("brijesh");
		obj.setCollegeName("birla");
		System.out.println(obj.getRollNo() + " " + obj.getName() + " " + obj.getCollegeName());
	}

}
