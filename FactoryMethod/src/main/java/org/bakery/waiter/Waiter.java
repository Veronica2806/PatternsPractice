package org.bakery.waiter;

import org.bakery.products.Product;

abstract public class Waiter {
	public void serveTheCustomer() {
		Product product = createProduct();
		System.out.println(product.serve());
	}
	abstract Product createProduct(); 	//factory method
}
