package Decorator;

//Decorador concreto - Adiciona açúcar ao café
class SugarDecorator extends CoffeeDecorator {
	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + ", com Açúcar";
	}

	@Override
	public double cost() {
		return coffee.cost() + 0.5;
	}
}