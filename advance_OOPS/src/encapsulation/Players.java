package encapsulation;

public class Players {

	public String name;
	public int health;
	public String weapon;
	
	public void loseHealth(int damage) {
		health=health-damage;
		if(health<0) {
			System.out.println("player is knock out of the game ");
		}
	}
	
	public int healthRemaining() {
		return this.health;
	}
	
	public void restoreHealth(int extraHelth) {
		health=health+extraHelth;
		if(health>100) {
			System.out.println(" player health is complity restored ");
			health=100;
		}
	}
}
