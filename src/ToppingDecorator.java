
abstract class ToppingDecorator implements Pizza {
	
	protected Pizza tempPizza;
	
	public ToppingDecorator(Pizza newPizza) {
		// TODO Auto-generated constructor stub
		this.tempPizza = newPizza;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription();
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost();
	}

}
