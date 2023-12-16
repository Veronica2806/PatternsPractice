package org.bakery.products;

import java.util.Map;

public class StringHelper {
	public static String generateOutput(Map<String, Boolean> orderDetails) {
		StringBuilder resultBuilder = new StringBuilder();
		orderDetails.forEach((title, value) -> {
			String currItem = String.format("%s %s ", value ? "with" : "without", title);
			resultBuilder.append(currItem);
		});
		return resultBuilder.toString();

	}
}
