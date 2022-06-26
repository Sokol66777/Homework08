package com.tc.les08.bigArray;

public class Zadanie35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int [6][6];
		int max;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=(int)(Math.random()*25);
			}
		}
		max=array[0][0];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(max<array[i][j]) {
					max=array[i][j];
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]%2==1) {
					array[i][j]=max;
				}
			}
		}
		System.out.println();
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
	}

}
