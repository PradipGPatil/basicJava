package encapsulation;

public class Test {
	
public static void main(String[] args) {
	// 1 disadventage- if player did not have constructor then calling code will have responsibility 
	// initialize the data
//	Players player=new Players();
//	// disadventage 2-  if we change name of the variable to fullName in player class then calling code also need to change the code
//	player.name="tim";
//	player.health=20;
//	player.weapon="sword";
//	
//	int damage=10;
//	player.loseHealth(damage);
//	
//	System.out.println(" reaminging health "+ player.healthRemaining());
//	// disadventage 3 ) this condition allow the by pass the check for player health 100 condition 
//	player.health=200;
//	
//	player.loseHealth(11);
//	System.out.println("remaing health "+ player.healthRemaining());
	
	EnhancedPlayer tim=new EnhancedPlayer("Tim");
	System.out.println(" intial health "+ tim.healthRemaining());
}

}
