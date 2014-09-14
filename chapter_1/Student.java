package chapter_1;

public class Student {
	private int id;
	private String name;

	Student() {};
	Student(int id, String name) {
		this.id = id;
		this.name= name;
	}

	public int getID() { return this.id; }
	public void setID(int id) {
	this.id = id;
	}
	
	public String getName() { return this.name; }
	public void setName(String name) {
		this.name = name;
	}
}
