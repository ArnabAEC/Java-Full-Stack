package com.Day2.multiDArr;

public class TwoDArrAdd {

	public static void main(String[] args) {
		int[][] Arr1 = {{3,4,5},{2,3,6},{7,8,9}};
		int[][] Arr2 = {{2,4,7},{5,2,7},{1,1,2}};
		
		int[][] Sum = new int[3][3];
		
		for(int i=0;i<Arr1.length; i++) {
			for(int j=0; j<Arr1[i].length; j++) {
				Sum[i][j] = Arr1[i][j] + Arr2[i][j];
			}
		}
		
		for(int i=0 ; i<Sum.length; i++) {
			for(int j = 0 ; j<Arr1[i].length; j++) {
				System.out.print(Arr1[i][j]+"  ");
			}
			if(i==Arr1.length/2) {
				System.out.print("  +    ");
			}else
				System.out.print("       ");
			for(int j = 0 ; j<Arr2[i].length; j++) {
				System.out.print(Arr2[i][j]+"  ");
			}
			if(i==Arr1.length/2) {
				System.out.print("  =    ");
			}else
				System.out.print("       ");
			for(int j=0; j<Sum[i].length; j++) {
				
				
				System.out.print(Sum[i][j]+"  ");
				
			}
			System.out.println();
		}
	}
}
