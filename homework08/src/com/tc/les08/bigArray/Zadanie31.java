package com.tc.les08.bigArray;

public class Zadanie31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int [7][6];
		int count=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=(int)(Math.random()*999);
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<array.length;i++) {
			for (int j=0;j<array[i].length;j++) {
				if(array[i][j]/10>0 && array[i][j]/10<10) {
					count+=1;
				}
			}
		}
		System.out.println("\n"+count);
	}

}
