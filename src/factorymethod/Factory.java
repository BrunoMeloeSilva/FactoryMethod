package factorymethod;

public class Factory {

	public Product method(int which) {
		
		switch (which) {
		case 0:
			return new ProductA();
		case 1:
			return new ProductB();
		default:
			throw new IllegalArgumentException("The type does not exist.");
		}
	}
}
