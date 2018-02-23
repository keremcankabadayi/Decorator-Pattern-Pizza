
public class RicottaCheese extends ToppingDecorator {

	public RicottaCheese(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
		System.out.println("Adding Ricotta Cheese");
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + ", Ricotta Cheese";
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost() + 1.00;
	}

}
