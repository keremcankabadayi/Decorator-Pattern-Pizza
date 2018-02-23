
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza basicPizza = new Mozzarella(new CheddarCheese(
				new RicottaCheese(new GorgonzolaCheese(new EmmentalCheese(new Parmesan(new PlainPizza()))))));

		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Total Cost: " + basicPizza.getCost());

	}

}
