package chapter_1;

import java.util.HashMap;

//Implementing HashMap 
public class HashMapExp {
	private HashMap<Integer, Student> map = new HashMap<Integer, Student>();
	
	public HashMap<Integer, Student> buildMap(Student[] students) {
	for(Student s : students) {
		map.put(s.getID(), s);
		}
	return map;
	}
	
	public void useMap() {
		for(int key: map.keySet()) {
			String value = map.get(key).getName();
			System.out.println(key + " : " + value);
		}
	}
}




