package abstractionAndInterface_11;

import java.util.ArrayList;
import java.util.Iterator;

public class AbstractionTest {
	
	public static void main(String[] args) {
		Dog dog=new Dog("wolf", "big", 100);
//		dog.makeNoise();
		
//		doAnimalStuff(dog);
		
		ArrayList<Animal> animal=new ArrayList<Animal>();
		animal.add(dog);
		animal.add(new Fish("barcoda","big",75));
		
		
		for(Animal a:animal) {
			doAnimalStuff(a);
		}
	}
	
	private static void doAnimalStuff(Animal animal) {
		animal.makeNoise();
		animal.move("slow");
	}
	


}
