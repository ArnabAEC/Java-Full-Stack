package array;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
	ArrayList<String> names;
	
	public Student(ArrayList<String> names) {
		super();
		this.names = names;
	}
	//insert at first position
	
	ArrayList<String> getNames() {
		return names;
	}
	void setNames(ArrayList<String> names) {
		this.names = names;
	}
	void insertAt1stPos(String name) {
		names.add(0, name);
	}
	//insert at last position
	void insertAtLastPos(String name) {
		names.add(names.size(), name);
	}
	//iterate
	void iterate() {
		System.out.print("Students: ");
		for(String name: names) {
			System.out.print(" " + name+ " ");
		}
		System.out.println();
	}
	//retrieve element
	void retrieve(int pos) {
		System.out.println("Student at position "+pos+" is "+names.get(pos-1));
	}
	
	//update specific array
	void update(int pos, String name) {
		names.set(pos-1, name);
	}
	
	//remove third element
	void removeThird() {
		names.remove(2);
	}
	
	//search
	String search(String name) {
		return name + (names.contains(name)? " exists.": " does not exists.");
	}
	
	//sort
	void sort() {
		Collections.sort(names);
	}
	
	//Copy student names from list
	void copyFromList(ArrayList<String> names) {
		Collections.copy(this.names, names);
	}
	
	
}
