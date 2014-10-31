package chapter_3;

import java.util.LinkedList;

public class Animal_Queue {
	private LinkedList<Dog> dogs;
	private LinkedList<Cat> cats;
	private int order;
	
	public Animal_Queue() {
		dogs = new LinkedList<Dog>();
		cats = new LinkedList<Cat>();
		order = 0;
		
		//Test cases
		enqueue(new Cat("Tom"));
		enqueue(new Dog("Bush"));
		enqueue(new Cat("Jack"));
		enqueue(new Dog("John"));
		enqueue(new Cat("Lilly"));
		enqueue(new Cat("Lucy"));
		enqueue(new Dog("Smile"));
	}
	
	public void enqueue(Animal a) {
		a.set_order(order);
		order++;
		
		//Check if the new animal is a cat or dog
		if(a instanceof Dog) {
			dogs.add((Dog) a);
		} else if(a instanceof Cat){
			cats.add((Cat) a);
		}
	}
	
	public Dog dequeue_dog() {
		return dogs.poll();
	}
	
	public Cat dequeue_cat() {
		return cats.poll();
	}
	
	public Animal dequeue_any() {
		if(dogs.isEmpty()) {
			return dequeue_cat();
		} else if(cats.isEmpty()) {
			return dequeue_dog();
		}
		
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		
		if(dog.is_order_than(cat)) {
			return dequeue_dog();
		} else {
			return dequeue_cat();
		}
	}
}
