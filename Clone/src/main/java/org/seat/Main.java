package org.seat;

public class Main {
	public static void main(String[] args) {
		Sofa sofaOne = new Sofa();
		sofaOne.setRoom("livingRoom");
		sofaOne.setTotalSeats(3);
		sofaOne.setAvailable(true);
		// work work work ...
		Sofa sofaTwo = (Sofa) sofaOne.clone();
		sofaTwo.setTotalSeats(2);
		//mostly we use cloned object with the values that were initialized during
		//creation of original object, but redefine one of the values
		System.out.println("sofaOne totalSeats" + sofaOne.getTotalSeats());
		System.out.println("sofaTwo totalSeats" + sofaTwo.getTotalSeats());
	}
}