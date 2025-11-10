package encapsulation;

public class Test {
	
public static void main(String[] args) {
//	Players player=new Players();
//	// if we change name of the variable to fullName in player class subClass need to chagne the anem
//	player.name="tim";
//	player.health=20;
//	player.weapon="sword";
//	
//	int damage=10;
//	player.loseHealth(damage);
//	
//	System.out.println(" reaminging health "+ player.healthRemaining());
//	// this condition allow the by pass the check for player health 100 condition 
//	player.health=200;
//	
//	player.loseHealth(11);
//	System.out.println("remaing health "+ player.healthRemaining());
	
	EnhancedPlayer tim=new EnhancedPlayer("Tim");
	System.out.println(" intial health "+ tim.healthRemaining());
}

}
