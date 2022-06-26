package com.tc.les08.bigArray;

import java.util.Random;

public class Zadanie08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int[5][6];
		Random rand=new Random();
		int count=0;
		for(int i=0;i<array.length;i++) {
				for(int j=0;j<array[i].length;j++) {
					array[i][j]=rand.nextInt(10);
				}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if (array[i][j]==7) {
					count+=1;
				}
			}
		}
		System.out.println("count="+count);
	}

}
