package com.tc.les08.bigArray;

import java.util.Random;

public class Zadanie07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int array[][]=new int[5][5];
		Random rand=new Random();
		int sum=0;
		for(int i=0;i<array.length;i++) {
				for(int j=0;j<array[i].length;j++) {
					array[i][j]=rand.nextInt(100);
				}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
					if(array[i][j]%3==0) {
					array[i][j]=-array[i][j];
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]<0&&array[i][j]%2==-1) {
					sum+=array[i][j];
				}
			}
		}
		System.out.println("Sum="+sum);
	}

}
