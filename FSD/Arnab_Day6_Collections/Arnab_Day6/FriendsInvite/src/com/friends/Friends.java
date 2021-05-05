package com.friends;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Friends {
	@Override
	public String toString() {
		return "Friends:\n" + friends;
	}

	ArrayList friends;

	public void Sort() {
		Collections.sort(friends);
	}
	public void invite(String event) {
		System.out.println(this.toString()+" have been invited to the "+event+".");
	}
	
	public Friends(ArrayList friends) {
		super();
		this.friends = friends;
	}

	public ArrayList getFriends() {
		return friends;
	}

	public void setFriends(ArrayList friends) {
		this.friends = friends;
	}
	
	
}
