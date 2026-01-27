package basicJava.StringManupulation;

public class EvenLengthWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a java language";
		StringBuffer sb=new StringBuffer();

		
		// print only even length world
		String[] sas=s.split(" ");
		for(String sa:sas) {
			if(sa.length()%2==0) {
				sb.append(sa).append(" ");
			}
		}
		
		System.out.println(sb);

	}

}
