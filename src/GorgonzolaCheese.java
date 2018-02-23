
public class GorgonzolaCheese extends ToppingDecorator {

	public GorgonzolaCheese(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
		
		System.out.println("Adding Gorgonzola Cheese");
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + ", Gorgonzola Cheese";
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost() + 1;
	}

}
