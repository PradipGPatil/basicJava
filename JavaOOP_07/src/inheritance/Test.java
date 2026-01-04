package inheritance;

public class Test {

	public static void main(String[] args) {
		Animal animal=new Animal("Generic Animal", "huge", 400);
		doAnimalStuff(animal, "slow");
		
		Dog dog=new Dog();
		doAnimalStuff(dog, "fast");
		
		Dog yorkie=new Dog("Yorkie", 15);
		doAnimalStuff(yorkie,"fast");
		
		
		Dog retriver=new Dog("Labrador retriver", 65, "Floppy", "Swimmer");
		doAnimalStuff(retriver, "slow");
		
		Dog wolf=new Dog("wolf",40);
		doAnimalStuff(wolf,"slow");
		
		Fish goldie=new Fish("GoldFish", 0.25, 2, 3);
		doAnimalStuff(goldie, "fast");
	}
	
	public static void doAnimalStuff(Animal animal, String speed) {
		animal.makeNoise();
		animal.move(speed);
		
		System.out.println(animal);
		System.out.println("---");
	}
}
