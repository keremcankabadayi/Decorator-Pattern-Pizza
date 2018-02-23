
public class Mushroom extends ToppingDecorator {

	public Mushroom(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
		
		System.out.println("Adding mushroom");
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", Mushroom";
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + .75;
	}

}
