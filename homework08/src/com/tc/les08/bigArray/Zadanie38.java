package com.tc.les08.bigArray;

import java.lang.reflect.Array;

public class Zadanie38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][]=new int [5][5];
		int array2[][]=new int [5][5];
		int array3[][]=new int [array1.length][array1[0].length];
		int a;
		int b;
		int p=1;
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				array1[i][j]=p;
				p+=1;
			}
		}
		p=1;
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				array2[i][j]=p;
				p+=1;
			}
		}
		if( (array1.length==array2.length) && (array1[0].length==array2[0].length) ){
			for(int i=0;i<array1.length; i++) {
				for (int j=0;j<array1[i].length;j++) {
					array3[i][j]=array1[i][j]+array2[i][j];
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
			System.out.println("Arrays not eqals");
		}
	}

}
