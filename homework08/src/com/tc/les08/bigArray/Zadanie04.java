package com.tc.les08.bigArray;

import java.util.Random;

public class Zadanie04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int[9][9];
		Random rand=new Random();
		for(int i=0;i<array.length;i++) {
				for(int j=0;j<array[i].length;j++) {
					array[i][j]=rand.nextInt(100);
				}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<array.length;i+=array.length-1) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
	}

}
