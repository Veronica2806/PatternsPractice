package org.car;

import org.car.Car.Car;
import org.car.director.Director;
import org.car.builder.CarBuilder;

public class Main {
	public static void main(String[] args) {
		CarBuilder builder = new CarBuilder();
		Director director = new Director(builder);
		director.constructCityCar();
		Car car = builder.getResult();
		System.out.println("Car built:\n" + car.isBattery());
	}
}