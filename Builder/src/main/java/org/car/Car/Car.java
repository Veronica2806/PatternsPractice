package org.car.Car;

public class Car {
	int seats;
	int doors;
	Engine engine;
	Transmission transmission;
	CarType type;
	boolean battery;

	public int getSeats() {
		return seats;
	}

	public int getDoors() {
		return doors;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public CarType getType() {
		return type;
	}

	public boolean isBattery() {
		return battery;
	}

	public Car(int seats, int doors, Engine engine, Transmission transmission, CarType type, boolean battery) {
		this.seats = seats;
		this.doors = doors;
		this.engine = engine;
		this.transmission = transmission;
		this.type = type;
		this.battery = battery;
	}


}
