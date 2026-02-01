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
		animal.add(new Hourse("karivadi", "large", 1000));
		
		for(Animal a:animal) {
			doAnimalStuff(a);
			if(a instanceof Mammal currentMammal) {
				currentMammal.shedHair();
			}
		}
	}
	
	// here in method parameter we are using animal
	// so passing any subclass will be work here we do not need to create seperated method
	// here java uses runtime polymerphism
	private static void doAnimalStuff(Animal animal) {
		animal.makeNoise();
		animal.move("slow");
	}
	


}
