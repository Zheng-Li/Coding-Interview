package chapter_1;

public class Permutation {
	
	//Check if second string is the permutation of the first one
	public boolean permutation(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		else
			return sort(s1).equals(sort(s2));
	}
	
	//Sort the Array of the letters
	public static String sort(String s) {
		char[] letters  = s.toCharArray();
		java.util.Arrays.sort(letters);
		return new String(letters);
	}
}
