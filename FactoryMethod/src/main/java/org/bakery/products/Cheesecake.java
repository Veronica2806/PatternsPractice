package org.bakery.products;

import java.util.Map;

public class Cheesecake implements Product {
	Map<String, Boolean> orderDetails;

	public Cheesecake(Map<String, Boolean> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String serve() {
		return String.format("This is your Cheesecake, %s", StringHelper.generateOutput(orderDetails));
	}

}
