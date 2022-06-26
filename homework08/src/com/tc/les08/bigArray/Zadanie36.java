package com.tc.les08.bigArray;

public class Zadanie36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][]=new int [6][5];
		double array2[][]=new double [6][5];
		int p=1;
		int count;
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				array1[i][j]=p;
				p+=1;
			}
		}
	
		for(int i=0;i<array1.length;i++) {
			for (int j=0;j<array1[i].length;j++) {
				count=0;
				if(i!=0) {
					array2[i][j]=array2[i][j]+array1[i-1][j];
					count+=1;
				}
				if(i != (array1.length-1) ) {
					array2[i][j]=array2[i][j]+array1[i+1][j];
					count+=1;
				}
				if(j!=0) {
					array2[i][j]=array2[i][j]+array1[i][j-1];
					count+=1;
				}
				if(j != array1[i].length-1) {
					array2[i][j]=array2[i][j]+array1[i][j+1];
					count+=1;
				}
				array2[i][j]=array2[i][j]/count;
			}
		}
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				System.out.printf("[%4d]",array1[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				System.out.printf("[%4.1f]",array2[i][j]);
			}
			System.out.println();
		}
	}

}
