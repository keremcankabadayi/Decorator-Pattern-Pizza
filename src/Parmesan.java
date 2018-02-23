
public class Parmesan extends ToppingDecorator {

	public Parmesan(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
		
		System.out.println("Adding Parmesan");
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + ", Parmesan";
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost() + 1.00;
	}
	

}
