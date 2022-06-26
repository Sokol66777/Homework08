package com.tc.les08.bigArray;

public class Zadanie21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int [5][5];
		for(int i=array.length-1;i>=0;i--) {
			for(int j=0;j<i+1;j++) {
				array[i][j]=j+(array.length-i);
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
	}

}
