package com.tc.les08.bigArray;
import java.util.Scanner;
public class Zadanie27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int m;
		int temp;
		int array[][] = new int [5][4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=(int)(Math.random()*50);
			}
		}
		System.out.println("Input n,m (n<m)");
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<array.length;i++) {
			temp=array[i][n];
			array[i][n]=array[i][m];
			array[i][m]=temp;
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
	}

}
