package basicJava.StringManupulation;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="listen";
		String s2="netsil";
		
		// check wheter this 2 string are anagram or not
		
		if(s1.length()!=s2.length()) {
			System.out.println("character are not equal length !!");
			return;
		}
		char[] s1s=s1.toCharArray();
		char [] s2s=s2.toCharArray();
		Arrays.sort(s1s);
		Arrays.sort(s2s);
		boolean a = Arrays.equals(s1s, s2s);
		if(a) {
			System.out.println("anagram !!");
		}else {
			System.out.println("not anagrem !!");
		}
	}

}
