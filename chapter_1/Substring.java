package chapter_1;

public class Substring {
	public Substring(){}
	
	public boolean is_substring(String s1, String s2) {
		if(s1.contains(s2)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean is_rotation(String s1, String s2) {
		if(s1.length() == s2.length()) {
			String s1s1 = s1 + s1;
			return is_substring(s1s1, s2);
		} else {
			return false;
		}
	}
}
