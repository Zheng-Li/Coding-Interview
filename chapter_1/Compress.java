package chapter_1;

import java.util.HashMap;

public class Compress {
	public String compress(String str) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String compress_str = "";
		
		for(int i=0; i<str.length(); i++) {
			if(map.keySet().contains(str.charAt(i))) {
				
			} else {
				
			}
		}
		
		if(compress_str.length() < str.length()) {
			return compress_str;
		} else {
			return str;
		}
	}
}
