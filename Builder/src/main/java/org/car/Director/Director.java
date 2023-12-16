package org.car.Director;

import org.car.Car.CarType;
import org.car.Car.Engine;
import org.car.Car.Transmission;
import org.car.builder.Builder;

public class Director {
	static Builder builder;
	public Director(Builder builder){
		Director.builder = builder;
	}
	public static void constructCityCar() {
		builder.setCarType(CarType.CITY_CAR);
		builder.setSeats(4);
		builder.setEngine(Engine.NONE);
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setBattery(true);
		builder.setDoors(4);
	}

	public static void constructSportsCar() {
		builder.setCarType(CarType.SPORTS_CAR);
		builder.setSeats(2);
		builder.setEngine(Engine.V_ENGINE);
		builder.setTransmission(Transmission.MANUAL);
		builder.setBattery(false);
		builder.setDoors(2);
	}
}
