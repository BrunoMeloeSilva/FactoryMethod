package main;

import factorymethod.Factory;
import factorymethod.Product;

public class Client {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Product product = factory.method(0);
		product.send();
	}
}
