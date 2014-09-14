package chapter_1;

import java.util.HashMap;

public class HashMapExp {
	public HashMap<Integer, Student> buildMap(Student[] students) {
	HashMap<Integer, Student> map = new HashMap<Integer, Student>();
	for(Student s : students) map.put(s.getID(), s);
	return map;
	}
}