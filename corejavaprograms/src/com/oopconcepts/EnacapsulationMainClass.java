package com.oopconcepts;

public class EnacapsulationMainClass {

	public static void main(String[] args) {
		EncapsulationProgram encapsulationProgram = new EncapsulationProgram();
		encapsulationProgram.setRollNo(25);
		encapsulationProgram.setName("Brijesh");
		encapsulationProgram.setCollegeName("Birla");
		System.out.println("Roll no is "+encapsulationProgram.getRollNo() +" , "+ " Name is " + encapsulationProgram.getName() +" , "+ " College name is " + encapsulationProgram.getCollegeName());
	}

}
