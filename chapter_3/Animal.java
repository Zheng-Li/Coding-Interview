package chapter_3;

public abstract class Animal {
	private int order;
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void set_order(int i) {
		this.order = i;
	}
	
	public int get_order() {
		return this.order;
	}
	
	public boolean is_order_than(Animal x) {
		return this.order < x.get_order();
	}
}
