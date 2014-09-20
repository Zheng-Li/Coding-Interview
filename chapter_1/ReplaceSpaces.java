package chapter_1;


public class ReplaceSpaces {
	private String result = "";
	
	//Replace the space within the String
	public String replaceSpace(String str) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ')
				result += str.charAt(i);
			else
				result += "%20";
		}
		return result;
	}
}
