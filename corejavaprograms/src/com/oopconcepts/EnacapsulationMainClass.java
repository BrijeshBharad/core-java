package com.oopconcepts;

public class EnacapsulationMainClass {

	public static void main(String[] args) {
		EncapsulationProgram encapsulationProgram = new EncapsulationProgram();
		encapsulationProgram.setRollNo(25);
		encapsulationProgram.setName("brijesh");
		encapsulationProgram.setCollegeName("birla");
		System.out.println(encapsulationProgram.getRollNo() + " " + encapsulationProgram.getName() + " " + encapsulationProgram.getCollegeName());
	}

}
