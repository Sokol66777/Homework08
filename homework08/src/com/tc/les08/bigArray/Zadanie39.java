package com.tc.les08.bigArray;

public class Zadanie39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][]=new int [4][5];
		int array2[][]=new int [5][3];
		int array3[][]=new int [array1.length][array2[0].length];
		int a;
		int b;
		int p=1;
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				array1[i][j]=p;
				p+=1;
			}
		}
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				System.out.printf("[%4d]",array1[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		p=1;
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				array2[i][j]=p;
				p+=1;
			}
		}
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				System.out.printf("[%4d]",array2[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		if(array1[0].length==array2.length) {
			for (int i=0;i<array3.length;i++) {
				for(int j=0;j<array3[i].length;j++) {
					for(int n=0; n<array1[i].length;n++)
					array3[i][j]=array3[i][j]+(array1[i][n]*array2[n][j]);
					
				}
			}
			for(int i=0;i<array3.length;i++) {
				for(int j=0;j<array3[i].length;j++) {
					System.out.printf("[%4d]",array3[i][j]);
				}
				System.out.println();
			}
	
		}
		else { 
				System.out.println("Wrong arrays");
		}
	}
}

