package chapter_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Compress {
	public String compress(String str) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> char_order = new ArrayList<String>();
		String compress_str = "";
		
		for(int i=0; i<str.length(); i++) {
			if(map.keySet().contains(str.charAt(i) + "")) {
				String key = str.charAt(i) + "";
				int value = map.get(key) + 1;
				map.put(key, value);
			} else {
				String key = str.charAt(i) + "";
				map.put(key, 1);
				char_order.add(key);
			}
		}
		
		for(String s : char_order) {
			compress_str += s + map.get(s);
		}
		
		if(compress_str.length() < str.length()) {
			return compress_str;
		} else {
			return str;
		}
	}
}
