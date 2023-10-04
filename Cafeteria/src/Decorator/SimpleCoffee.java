package Decorator;

//Implementação concreta de um café simples
class SimpleCoffee implements Coffee {
	@Override
	public String getDescription() {
		return "Café simples";
	}

	@Override
	public double cost() {
		return 2.0;
	}
}