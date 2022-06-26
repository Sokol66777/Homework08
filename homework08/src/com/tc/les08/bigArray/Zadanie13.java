package com.tc.les08.bigArray;

public class Zadanie13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int [6][6];
		for(int i=0;i<array.length;i++) {
			if(i%2==0) {
				for(int j=0;j<array[i].length;j++) {
					array[i][j]=j+1;
				}
			}
			else {
				for(int j=0;j<array[i].length;j++) {
					array[i][j]=array[i].length-j;
				}
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
