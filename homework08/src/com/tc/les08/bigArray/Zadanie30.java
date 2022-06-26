package com.tc.les08.bigArray;

public class Zadanie30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int [10][20];
		int count=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=(int)(Math.random()*15);
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<array.length;i++) {
			count=0;
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]==5) {
					count+=1;
				}
				if(count>2) {
					System.out.print(i + " ");
					break;
				}
			}
		}
	}

}
