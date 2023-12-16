package org.car.builder;

import org.car.Car.Car;
import org.car.Car.CarType;
import org.car.Car.Engine;
import org.car.Car.Transmission;

public class CarBuilder implements Builder {
	int seats;
	int doors;
	Engine engine;
	Transmission transmission;
	CarType carType;
	boolean battery;

	@Override
	public void setEngine(Engine engineType) {
		this.engine = engineType;
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public void setTransmission(Transmission transmissionType) {
		this.transmission = transmissionType;
	}

	@Override
	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	@Override
	public void setBattery(boolean battery) {
		this.battery = battery;
	}

	public Car getResult() {
		return new Car(seats, doors, engine, transmission, carType, battery);
	}
}
