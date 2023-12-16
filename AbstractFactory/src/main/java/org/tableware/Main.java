package org.tableware;

import org.tableware.waiter.CeramicWaiter;
import org.tableware.waiter.PlasticWaiter;
import org.tableware.waiter.Waiter;

public class Main {
	public static void main(String[] args) {
		try {
			Application app = config("ceramic");
			app.serveTableware();
		}
		catch (Exception ex){
			System.out.println(ex.getMessage());
		}

	}

	public static Application config(String material) throws Exception {
		Application app;
		Waiter waiter;

		if (material.equals("plastic")) {
			waiter = new PlasticWaiter();
		} else if (material.equals("ceramic")) {
			waiter = new CeramicWaiter();
		} else {
			throw new Exception("Unknown tableware piece");
		}
		app = new Application(waiter);
		return app;
	}
}

