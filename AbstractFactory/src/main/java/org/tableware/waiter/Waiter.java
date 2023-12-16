package org.tableware.waiter;

import org.tableware.cup.Cup;
import org.tableware.plate.Plate;

public interface Waiter {
	Cup serveCup();
	Plate servePlate();
}
