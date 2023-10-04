package Decorator;

public class Main {
	public static void main(String[] args) {
		// Crie um café simples
		Coffee coffee = new SimpleCoffee();
		System.out.println("Café simples - Descrição: " + coffee.getDescription() + ", Custo: $" + coffee.cost());

		// Adicione leite ao café
		coffee = new MilkDecorator(coffee);
		System.out.println("Café com Leite - Descrição: " + coffee.getDescription() + ", Custo: $" + coffee.cost());

		// Adicione açúcar ao café com leite
		coffee = new SugarDecorator(coffee);
		System.out.println(
				"Café com Leite e Açúcar - Descrição: " + coffee.getDescription() + ", Custo: $" + coffee.cost());
	}
}