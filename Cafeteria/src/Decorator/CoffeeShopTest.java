package Decorator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CoffeeShopTest {

	@Test
	public void testSimpleCoffee() {
		// Testa um café simples
		Coffee coffee = new SimpleCoffee();
		assertEquals("Café simples", coffee.getDescription());
		assertEquals(2.0, coffee.cost(), 0.01);
	}

	@Test
	public void testCoffeeWithMilk() {
		// Testa um café com leite
		Coffee coffee = new SimpleCoffee();
		coffee = new MilkDecorator(coffee);
		assertEquals("Café simples, com Leite", coffee.getDescription());
		assertEquals(3.5, coffee.cost(), 0.01);
	}

	@Test
	public void testCoffeeWithMilkAndSugar() {
		// Testa um café com leite e açúcar
		Coffee coffee = new SimpleCoffee();
		coffee = new MilkDecorator(coffee);
		coffee = new SugarDecorator(coffee);
		assertEquals("Café simples, com Leite, com Açúcar", coffee.getDescription());
		assertEquals(4.0, coffee.cost(), 0.01);
	}
}