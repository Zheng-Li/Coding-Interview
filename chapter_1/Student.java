package chapter_1;

public class Student {
	private int ID;
	private String name;
	
	private Student() {};
	private Student(int id, String name) {
		this.ID = id;
		this.name= name;
	}
	
	public int getID() { return this.ID; }
	public String getName() { return this.name; }
		
}
