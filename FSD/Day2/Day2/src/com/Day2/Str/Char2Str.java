package com.Day2.Str;
//Java Program to convert char Array to String

public class Char2Str {
	public static void main(String[] args) {
		char[] chs = { 'H', 'E', 'L', 'L', 'O'};
	
		String str = new String();
		for(int i = 0; i < chs.length; i++)
			str += chs[i];
		
		System.out.println(str);
	}	
}
