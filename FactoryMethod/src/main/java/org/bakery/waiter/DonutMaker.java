package org.bakery.waiter;

import org.bakery.products.Donut;
import org.bakery.products.Product;

import java.util.Map;

public class DonutMaker extends Waiter {
	Map<String, Boolean> orderDetails;
	public DonutMaker(Map<String, Boolean> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	Product createProduct(){
		return new Donut(orderDetails);
	}
}
