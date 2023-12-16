package org.bakery.waiter;

import org.bakery.products.Cheesecake;
import org.bakery.products.Product;

import java.util.Map;

public class CheesecakeMaker extends Waiter {

	Map<String, Boolean> orderDetails;

	public CheesecakeMaker(Map<String, Boolean> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	Product createProduct() {
		return new Cheesecake(orderDetails);
	}
}
