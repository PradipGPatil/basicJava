package exercise01;

public class CoffeMaker {

	private boolean hasWorkToDo;

	public void setHasWorkTodo(boolean hasWorkTodo) {
		this.hasWorkToDo = hasWorkTodo;
	}

	public void brewCoffe() {
		if(hasWorkToDo) {
		System.out.println(" breww coffe ");	
		hasWorkToDo=false;
		}
	}
}

class Refrigerator {

	private boolean hasWorkToDo;

	public void setHasWorkTodo(boolean hasWorkTodo) {
		this.hasWorkToDo = hasWorkTodo;
	}

	public void orderFood() {
		if(hasWorkToDo) {
		System.out.println(" ordering food ");	
		hasWorkToDo=false;
		}
	}
}

class DishWasher {

	private boolean hasWorkToDo;

	public void setHasWorkTodo(boolean hasWorkTodo) {
		this.hasWorkToDo = hasWorkTodo;
	}

	public void doDishes() {
		if(hasWorkToDo) {
		System.out.println(" do dishes ");	
		hasWorkToDo=false;
		}
	}


}