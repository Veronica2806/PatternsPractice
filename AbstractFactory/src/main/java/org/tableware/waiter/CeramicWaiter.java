package org.tableware.waiter;

import org.tableware.cup.CeramicCup;
import org.tableware.cup.Cup;
import org.tableware.plate.CeramicPlate;
import org.tableware.plate.Plate;

public class CeramicWaiter implements Waiter {
	public Cup serveCup(){
		return new CeramicCup();
	}

	public Plate servePlate(){
		return new CeramicPlate();
	}
}
