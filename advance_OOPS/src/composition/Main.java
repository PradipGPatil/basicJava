package composition;



public class Main {

	
	public static void main(String[] args) {
		ComputorCase computorCase=new ComputorCase("2203", "Dell", "240");
		
		Monitor monitor=new Monitor("27 inch beast", "Acer", 27, "2540X1440");
		
		MotherBoard motherBoard=new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");
		
		PersonComputor thePc=new PersonComputor("208", "Dell", monitor, motherBoard, computorCase);
		
//		thePc.getMonitor().drawFixelAt(10, 10, "red");
//		thePc.getMotherBoard().loadPrograme("window os");
//		thePc.getComputorCase().pressPowerButton();
		thePc.powerUp();
	}
	
}
