package org.bakery.products;

import java.util.Map;

public class Donut implements Product {
	Map<String, Boolean> orderDetails;

	public Donut(Map<String, Boolean> orderDetails) {
		this.orderDetails = orderDetails;
	}


	@Override
	public String serve(){
		return String.format("Please have your Donut");
	}

}
