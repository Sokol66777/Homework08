package com.tc.les08.bigArray;

import java.util.Random;

public class Zadanie10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int[9][7];
		Random rand=new Random();
		int k=3;
		int p=0;
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
		System.out.println("k="+k);
		for(int i=k, j=0;j<array[i].length;j++) {
			System.out.printf("[%4d]",array[i][j]);
		}
		System.out.println("\np="+p);
		for(int i=0,j=p;i<array.length;i++) {
			System.out.printf("[%4d]\n",array[i][j]);
		}
	}

}
