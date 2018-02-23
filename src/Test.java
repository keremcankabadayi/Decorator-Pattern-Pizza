
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza basicPizza = new Mushroom(new Mozzarella(new PlainPizza()));
		
		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Total Cost: " + basicPizza.getCost());
	}

}
