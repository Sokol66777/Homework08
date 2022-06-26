package com.tc.les08.bigArray;

public class Zadanie17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int [5][5];
		for(int i=0;i<array.length;i=i+array.length-1) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=1;
			}
		}
		for(int i=1;i<array.length-1;i++) {
			for(int j=0;j<array[i].length;j+=array[i].length-1) {
				array[i][j]=1;
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
