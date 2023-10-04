package Decorator;

//Decorator abstrato para os decoradores de café
abstract class CoffeeDecorator implements Coffee {
	protected Coffee coffee;

	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	public String getDescription() {
		return coffee.getDescription();
	}

	public double cost() {
		return coffee.cost();
	}
}