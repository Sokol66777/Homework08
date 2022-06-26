package com.tc.les08.bigArray;
import java.util.Arrays;
public class Zadanie29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=new int [6][6];
		int count=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=(int)(Math.random()*50);
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<array.length;i++) {
			if(array[i][i]>0) {
				count+=1;
			}
		}
		int newarray[]=new int[count];
		for(int i=0,j=0;i<array.length;i++) {
			if(array[i][i]>0) {
				newarray[j]=array[i][i];
				j++;
			}
		}
		System.out.println("\n"+Arrays.toString(newarray));
		
	}

}
