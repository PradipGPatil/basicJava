package serilizationAndFileIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


// serilize object is difficut to read for human but easy for java
// godd when we used for jave program
public class GameSaverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GameCharacter one=new GameCharacter(50, "pradip",new String []{"bow","sword"});
		GameCharacter two=new GameCharacter(50, "pankaj",new String []{"bow","axe"});
		GameCharacter three=new GameCharacter(50, "Rajini",new String []{"bow","invisiable"});
		
		// create connection stream and serilizing the object
		
		try {
		// file output stream know how to connect to the file
		FileOutputStream fo=new FileOutputStream("Game.ser");
		
		// object output steam let you write the object but it does not know 
		// how to connect with file so earlier we created fileoutput steam (connection stram)
		// this is alos know as the "chaning stream"
		
		ObjectOutputStream os=new ObjectOutputStream(fo);
		os.writeObject(one);
		os.writeObject(two);
		os.writeObject(three);
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		// now make this object as null
		one=null;
		two=null;
		three=null;
		
		// now we will read the object from the file
		try {
		// this connection stram know how to connect the file and read the data
		FileInputStream fi=new FileInputStream("Game.ser");
		
		// know how to read the object and has method to read
		ObjectInputStream is=new ObjectInputStream(fi);
		
		// cast the object into GameCharacter
		GameCharacter oneRestore = (GameCharacter)is.readObject();
		GameCharacter twoRestore = (GameCharacter)is.readObject();
		GameCharacter threeRestore = (GameCharacter)is.readObject();
		
		
		// check to see it worked
		
		System.out.println(oneRestore.getType());
		System.out.println(twoRestore.getType());
		System.out.println(threeRestore.getType());
		
		}
		catch(Exception e) {
		e.printStackTrace();	
		}

	}

}
