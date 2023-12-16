package org.car.builder;

import org.car.Car.CarType;
import org.car.Car.Engine;
import org.car.Car.Transmission;

public interface Builder {
	void setEngine(Engine engineType);

	void setSeats(int seats);

	void setDoors(int doors);

	void setTransmission(Transmission transmissionType);

	void setCarType(CarType type);

	void setBattery(boolean battery);
}
