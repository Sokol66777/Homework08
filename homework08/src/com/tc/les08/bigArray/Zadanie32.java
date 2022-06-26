package com.tc.les08.bigArray;
import java.util.Arrays;
public class Zadanie32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int [7][6];
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
		for(int i=0;i<array.length;i++) {
			Arrays.sort(array[i]);
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length-1;j++) {
				for(int p=j+1;p<array[i].length;p++) {
					if(array[i][j]<array[i][p]) {
						temp=array[i][j];
						array[i][j]=array[i][p];
						array[i][p]=temp;
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
	}

}
