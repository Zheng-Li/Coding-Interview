package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Test test = new Test();;
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("ignore");
		list.add("456");
		list.add("ignore");
		list.add("123"); 
		list.add("789");
		test.parse(list);
	}
}
