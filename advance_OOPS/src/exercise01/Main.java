package exercise01;

public class Main {

	public static void main(String[] args) {
		
		SmartKitchen smartKichen=new SmartKitchen();
		
//		smartKichen.getBrewMaster().setHasWorkTodo(true);
//		smartKichen.getDishWasher().setHasWorkTodo(true);
//		smartKichen.getIcebox().setHasWorkTodo(true);
//		
//		
//		smartKichen.getDishWasher().doDishes();
//		smartKichen.getIcebox().orderFood();
//		smartKichen.getBrewMaster().brewCoffe();
		
		smartKichen.setKitcheState(true, false, true);
		smartKichen.doKitcheWork();
	}
}
