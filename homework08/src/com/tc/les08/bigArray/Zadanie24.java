package com.tc.les08.bigArray;

public class Zadanie24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,5,6};
		int array2[][]=new int [array.length][array.length];
		for(int j=0;j<array.length;j++) {
			for(int i=0;i<array.length;i++) {
				array2[i][j]=(int)Math.pow(array[j],i+1);
			}
		}
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				System.out.printf("[%7d]",array2[i][j]);
			}
			System.out.println();
		}
	}

}
