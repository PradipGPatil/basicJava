package inhertance02;

public class Test {

	public static void main(String[] args) {
		Animal animal = new Animal("Huge", " Generic Animal", 400);
		doAnimalStuff(animal, "slow ");

		
		Dog dog=new Dog();
		
		// we can able to pass dog to Animal parameter as dog inherte the Animal call
		doAnimalStuff(dog, " fast");
		
		
		Dog youke=new Dog("youke", 15);
		doAnimalStuff(youke, "fast");
		
		Dog retriver=new Dog("Lobodar retriver",65,"flopply","swimmer");
		doAnimalStuff(retriver, "slow");
		
		Dog wolf=new Dog("Wolf",40);
		doAnimalStuff(wolf, "slow");
		
		Fish golddie=new Fish("Goldish", 0.2, 2, 3);
		doAnimalStuff(golddie, "fast");
	}

	public static void doAnimalStuff(Animal animal, String speed) {
		animal.makeNoise();
		animal.move(speed);
		System.out.println(animal);
		System.out.println("--- ");
	}
}
