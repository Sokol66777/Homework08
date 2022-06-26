package com.tc.les08.bigArray;

public class Zadanie28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxindex=0;
		int array[][] = new int [5][5];
		int sumarr[]=new int[array.length];
		int max=sumarr[0];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=(int)(Math.random()*50);
			}
		}
		for(int j=0;j<array.length;j++) {
			for(int i=0;i<array.length;i++) {
				sumarr[j]+=array[i][j];
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<sumarr.length;i++) {
			System.out.printf("[%4d]",sumarr[i]);
		}
		for(int i=0;i<sumarr.length;i++) {
			if(max<sumarr[i]) {
				max=sumarr[i];
				maxindex=i+1;
			}
		}
		System.out.println();
		System.out.println("max sum in "+maxindex+" column");
	}

}
