package inhertance01;

public class Test {

	public static void main(String[] args) {
		Animal animal = new Animal("Huge", " Generic Animal", 400);
		doAnimalStuff(animal, "slow ");

		
		Dog dog=new Dog();
		
		// we can able to pass dog to Animal parameter as dog inherte the Animal call
		doAnimalStuff(dog, " fast");
	}

	public static void doAnimalStuff(Animal animal, String speed) {
		animal.makeNoise();
		animal.move(speed);
		System.out.println(animal);
		System.out.println("--- ");
	}
}
