package exercise107;

public class Printer {

	
	private int tonnerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonnerLevel, int pagesPrinted, boolean duplex) {
		if(tonnerLevel>100 || tonnerLevel<0) {
			this.tonnerLevel=-1;
		}
		else {
			this.tonnerLevel = tonnerLevel;
		}
		
		this.pagesPrinted = pagesPrinted;
		this.duplex = duplex;
	}
	
	public int addToner(int tonnerAmount) {
		
		this.tonnerLevel=this.tonnerLevel+tonnerAmount;
		if(tonnerLevel>100 || tonnerLevel<0) {
			return tonnerLevel=-1;
		}
		
		return this.tonnerLevel;
		
		 
	}
	
	public int printPages(int pages) {
		if(duplex) {
			System.out.println(" it is duplex printer");
			return  pagesPrinted=pages/2;
		}
		else {
			return pagesPrinted=pages;
		}
	}
	

}
