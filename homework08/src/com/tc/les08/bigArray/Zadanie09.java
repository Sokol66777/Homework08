package com.tc.les08.bigArray;

import java.util.Random;

public class Zadanie09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int[6][6];
		Random rand=new Random();
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
		System.out.println("Main diag");
		String s="    "; 
		for(int i=0;i<array.length;i++) {
			System.out.print(s);
			System.out.println(array[i][i]);
			s=s+"    ";
		}
		System.out.println("side diag");
		for(int i=0,j=array.length-1;i<array.length;i++) {
			s="    ";
			for(int p=0;p<j;p++) {
				s=s+"    ";
			}
			System.out.print(s);
			System.out.println(array[i][j]);
			j=j-1;
		}
	}

}
