package org.tableware;

import org.tableware.cup.Cup;
import org.tableware.plate.Plate;
import org.tableware.waiter.Waiter;

public class Application {
	Cup cup;
	Plate plate;

	public Application(Waiter waiter) {
		this.cup = waiter.serveCup();
		this.plate = waiter.servePlate();
	}

	void serveTableware(){
		cup.serve();
		plate.serve();
	}
}
