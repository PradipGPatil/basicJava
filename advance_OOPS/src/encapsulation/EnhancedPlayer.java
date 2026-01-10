package encapsulation;

public class EnhancedPlayer {
	private String fullName;
	private int health;
	private String weapon;
	
	
	

	public EnhancedPlayer(String name) {
		this(name,100,"sword");
	}




	public EnhancedPlayer(String name, int health, String weapon) {
		super();
		this.fullName = name;
		if (health <= 0) {
			this.health = 1;
		} else if (health > 100) {
			this.health = 100;
		} else {
			this.health = health;
		}
		this.weapon = weapon;
	}
	
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
