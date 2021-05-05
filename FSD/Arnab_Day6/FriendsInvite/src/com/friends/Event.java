package com.friends;

import java.util.ArrayList;
import java.util.Scanner;

public class Event {
	public static void main(String[] args) {
		
		Friends friendslist = new Friends(new ArrayList()); 

	
		for( ; ; ) {
			System.out.println("Enter friends names: ");
			
			Scanner sc = new Scanner(System.in);
			String frnd = sc.nextLine();
			if(friendslist.friends.indexOf(frnd)==-1)
				friendslist.friends.add(frnd);
			System.out.println("Add more friends? (Y/N): ");
			String chck = sc.next();
			if(chck.equalsIgnoreCase("y")) {
				continue;
			}
			else if (chck.equalsIgnoreCase("n")) {
				break;
			}
		}
		
		friendslist.Sort();
		
		
		friendslist.invite("Birthday party");
	}
	
}
