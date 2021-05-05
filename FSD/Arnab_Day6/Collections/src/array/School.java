package array;

import java.util.ArrayList;

public class School {
 
	public static void main(String[] args) {
		
		Student students = new Student(new ArrayList<String>());
		students.getNames().add("Arnab");
		students.getNames().add("Mark");
		students.getNames().add("Carl");
		students.getNames().add("Zeus");
		students.getNames().add("Thor");
		students.iterate();
		students.insertAt1stPos("Ram");
		students.iterate();
		students.insertAtLastPos("Mars");
		students.iterate();
		students.retrieve(3);
		students.update(2, "Sneha");
		students.iterate();
		students.removeThird();
		students.iterate();
		System.out.println("Search result: "+students.search("Sneha"));
		System.out.println("Search result: "+students.search("Bonchie"));
		students.sort();
		students.iterate();
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Aron");
		names.add("Sun");
		names.add("Bittu");
		names.add("Adri");
		
		students.copyFromList(names);
		System.out.println("New record copied from previous file: ");
		students.iterate();
		
	}
}
