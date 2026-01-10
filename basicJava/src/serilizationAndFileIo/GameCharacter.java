package serilizationAndFileIo;

import java.io.Serializable;


// implementing serilizaable tell the JVM its okay to serialize this class
public class GameCharacter implements Serializable {
	int power;
	String type;
	String[] weapons;
	
	
	
	public GameCharacter(int power, String type, String[] weapons) {
		super();
		this.power = power;
		this.type = type;
		this.weapons = weapons;
	}
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWeapons() {
		String weaponsList="";
		
		for(int i=0; i<weaponsList.length();i++) {
			weaponsList=weapons[i]+" ";
		}
		
		return weaponsList;
	}
	public void setWeapons(String[] weapons) {
		this.weapons = weapons;
	}
	
	

}
