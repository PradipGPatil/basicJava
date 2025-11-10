package third_Java;

public class Switch01Test {

	public static void main(String[] args) {

		// here we have single value which need to be check
		// so we can use if statment or switch statment
		
		System.out.println(" calling tradition switch => " + Switch01Test.traditionSwitch("Jan"));
		System.out.println(" calling tradition switch => " + Switch01Test.enhanceSwitch("Dec"));
		int switchValue = 3;
		switch (switchValue) {

		case 1:
			System.out.println(" value is 1");
			break;
		case 2:
			System.out.println(" value is 2");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(" value is 3, 4 and 5");
			break;
		default:
			System.out.println(" value was not in 1 and 2");
		}

	}

	public static String traditionSwitch(String month) {

		switch (month) {
		case "Jan":
		case "Feb":
		case "March":
			return "1 st quertor";

		case "April":
		case "May":
		case "Jun":
			return "2 nd quertor";

		case "Jully":
		case "Aug":
		case "sep":
			return "2 nd quertor";

		case "Oct":
		case "Nov":
		case "Dec":
			return "2 nd quertor";
		default:
			return " bad argument";

		}
	};

	
	// case end statment shoudl have ; statement other wise ide will give error
public static String enhanceSwitch(String month) {
	return switch(month) {
	case "Jan","Feb","March"->"1 st quertor";	
	case "April", "May","Jun"->"2nd quertor";

	case "Jully","Aug","Sep"-> "3rd quertor";
	case "Oct","Nov","Dec"->"4 th quertor";

	default-> { 
	String badResponse=" passing bad argument ";
	yield badResponse;
	}
};
}
}