
public class EmmentalCheese extends ToppingDecorator {

	public EmmentalCheese(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
		
		System.out.println("Adding Emmantal Cheese");
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", Emmantal Cheese";
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 1;
	}

}
