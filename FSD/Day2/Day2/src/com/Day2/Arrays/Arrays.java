package com.Day2.Arrays;
/*
JAVA ARRAYS PROGRAMS
Java Program to Calculate average of numbers using Array
Java Program to Add the numbers of an Array
Java Program to reverse an array
Java Program to sort an array in ascending order

*/
public class Arrays {
	public static void main(String[] args) {
		
		int[] Arr = {5, 8 , 9 , 2 , 44, 98};
		Disp(Arr);
		System.out.println(Avg(Arr));
		System.out.println(Sum(Arr));
		Reverse(Arr);
		Disp(Arr);
		Sort(Arr);
		Disp(Arr);

	}
	
	static int Avg(int [] Arr) {
		int Avg = 0;
		for(int i=0; i<Arr.length; i++) {
			Avg += Arr[i];
		}
		Avg = Avg/Arr.length;
		return Avg;
	}
	
	static int Sum(int [] Arr) {
		int sum = 0;
		for(int i=0; i<Arr.length; i++) {
			sum += Arr[i];
		}
		return sum;
	}
	static void Disp(int [] Arr) {
		for(int i=0; i< Arr.length; i++)
			System.out.print(Arr[i]+" ");
		System.out.println();
	}
	static void Reverse(int [] Arr) {
		int tmp = 0;
		for(int i=0; i<Arr.length/2; i++) {
			tmp= Arr[i];
			Arr[i] = Arr[Arr.length-i-1];
			Arr[Arr.length-i-1] = tmp;
		}
		return;
	}
	static void Sort(int [] Arr) {
		int tmp = 0;
		int j, min;
		for(int i=0; i<Arr.length; i++) {
			for(j=i+1, min = i; j<Arr.length; j++)
			{
				if(Arr[min]>Arr[j])
					min = j;
			}
			tmp= Arr[i];
			Arr[i] = Arr[min];
			Arr[min] = tmp;
		}
		return;
	}

}
