package org.tableware.waiter;

import org.tableware.cup.Cup;
import org.tableware.cup.PlasticCup;
import org.tableware.plate.PlasticPlate;
import org.tableware.plate.Plate;

public class PlasticWaiter implements Waiter {
	public Cup serveCup(){
		return new PlasticCup();
	}

	public Plate servePlate(){
		return new PlasticPlate();
	}
}
