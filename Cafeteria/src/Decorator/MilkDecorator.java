package Decorator;

//Decorador concreto - Adiciona leite ao café
class MilkDecorator extends CoffeeDecorator {
	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + ", com Leite";
	}

	@Override
	public double cost() {
		return coffee.cost() + 1.5;
	}
}