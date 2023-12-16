package org.bakery;

import org.bakery.waiter.CheesecakeMaker;
import org.bakery.waiter.DonutMaker;
import org.bakery.waiter.Waiter;

import java.util.Map;

public class Main {
	static Waiter waiter;

	public static void main(String[] args) {
		try {
			String order = "cheesecake";
			Map<String, Boolean> orderDetails = Map.of("jam", true, "sugar", true);
			init(order, orderDetails);
			waiter.serveTheCustomer();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void init(String order, Map<String, Boolean> orderDetails) throws Exception {
		if (order.equals("donut")) {
			waiter = new DonutMaker(orderDetails);
		} else if (order.equals("cheesecake")) {
			waiter = new CheesecakeMaker(orderDetails);
		} else {
			throw new Exception("Unknown product");
		}
	}

}