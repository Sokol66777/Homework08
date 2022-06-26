package com.tc.les08.bigArray;

public class Zadanie37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int [8][8];
		int a;
		int b;
		int p=1;
		int temp;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=p;
				p+=1;
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int c=0;c<15;c++) {
			a=(int)(Math.random() * array.length);
			b=(int)(Math.random() * array.length);
			for (int i=a;i==a;i++) {
				for(int j=0;j<array[i].length;j++) {
					temp=array[i][j];
					array[i][j]=array[b][j];
					array[b][j]=temp;
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
