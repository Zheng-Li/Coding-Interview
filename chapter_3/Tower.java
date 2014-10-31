package chapter_3;

import java.util.Stack;

public class Tower {
	private Stack<Integer> disks;
	private int index;
	
	public Tower(int i) {
		this.index = i;
		disks = new Stack<Integer>();
	}
	
	public int get_index() {
		return this.index;
	}
	
	public void add_disk(int data) {
		if(!disks.isEmpty() && disks.peek() <= data) {
			System.out.println("Error placing disk " + data);
		} else {
			disks.push(data);
		}
	}
	
	public void move_top_disk_to(Tower destination) {
		int top = disks.pop();
		destination.add_disk(top);
		System.out.println("Moving disk " + top + " from " + get_index() 
				+ " To " + destination.get_index());
	}
	
	public void move_disks_to(int disk_num, Tower destination, Tower buffer) {
		if(disk_num == 1) {
			move_top_disk_to(destination);
		}
		if(disk_num > 1) {
			move_disks_to(disk_num-1, buffer, destination);
			move_top_disk_to(destination);
			buffer.move_disks_to(disk_num-1, destination, this);
		}
	}
	
}
