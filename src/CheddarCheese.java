
public class CheddarCheese extends ToppingDecorator {

	public CheddarCheese(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
		System.out.println("Adding Cheddar Cheese");
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", Cheddar Cheese";
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 1;
	}

}
