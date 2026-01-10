package compositionChallenge;

public class SmartKitchen {
	
	private CoffeMaker brewMaster;
	private DishWasher dishWasher;
	private Refrigerator icebox;
	
	public SmartKitchen() {
		brewMaster=new CoffeMaker();
		dishWasher=new DishWasher();
		icebox=new Refrigerator();
	}
	
	public void setKitcheState(boolean coffeFlag,boolean friedgeFlag, boolean dishWashFlag) {
		brewMaster.setHasWorkTodo(coffeFlag);
		dishWasher.setHasWorkTodo(dishWashFlag);
		icebox.setHasWorkTodo(friedgeFlag);
	}
	
	public void doKitcheWork() {
		brewMaster.brewCoffe();
		icebox.orderFood();
		dishWasher.doDishes();
	}

	public CoffeMaker getBrewMaster() {
		return brewMaster;
	}

	public DishWasher getDishWasher() {
		return dishWasher;
	}

	public Refrigerator getIcebox() {
		return icebox;
	}

	

}
