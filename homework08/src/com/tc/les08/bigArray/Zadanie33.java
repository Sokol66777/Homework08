package com.tc.les08.bigArray;

import java.util.Arrays;

public class Zadanie33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int [6][7];
		int temp;
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
		System.out.println();
		for(int j=0, i=0;j<array[i].length;j++) {
			for(i=0;i<array.length-1;i++) {
				for(int p=i+1;p<array.length;p++) {
					if(array[i][j]>array[p][j]) {
						temp=array[i][j];
						array[i][j]=array[p][j];
						array[p][j]=temp;
					}
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
		for(int j=0, i=0;j<array[i].length;j++) {
			for(i=0;i<array.length-1;i++) {
				for(int p=i+1;p<array.length;p++) {
					if(array[i][j]<array[p][j]) {
						temp=array[i][j];
						array[i][j]=array[p][j];
						array[p][j]=temp;
					}
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
	}

}
