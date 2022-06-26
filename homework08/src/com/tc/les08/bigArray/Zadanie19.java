package com.tc.les08.bigArray;

public class Zadanie19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int [7][7];
		int p=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i;j<array[i].length-i;j++) {
				array[i][j]=1;
			}
		}
		for(int i=array.length-1;i>=0;i--) {
			for(int j=p;j<array[i].length-p;j++) {
				array[i][j]=1;
			}
			p++;
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
	}

}
