package com.tc.les08.bigArray;
import java.util.Scanner;
public class Zadanie26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input 'n' and 'm'- size of array ");
		n=sc.nextInt();
		m=sc.nextInt();
		int maxel=Integer.MIN_VALUE;
		int maxi=0;
		int maxj=0;
		int minel=Integer.MAX_VALUE;
		int mini=0;
		int minj=0;
		int temp;
		int array [][] = new int [n][m];
		int sum[] = new int [n];
		int max[] = new int [n];
		for(int i=0;i<n;i++) {
			max[i]=Integer.MIN_VALUE;
		}
		//for(int i=0;i<n;i++) {
			//for(int j=0;j<m;j++) {
				//System.out.printf("array[%3d][%3d]=",i,j);
				//array[i][j]=sc.nextInt();
				//System.out.println();
			//}
		//}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
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
			for(int j=0;j<array[i].length;j++) {
				if(max[i]<array[i][j]) {
					max[i]=array[i][j];
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.printf("max[%4d]=[%4d]",i, max[i]);
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(0>array[i][j]) {
					sum[i]+=array[i][j];
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.printf("sum[%4d]=[%4d]",i, sum[i]);
			System.out.println();
		}
		for (int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(maxel<array[i][j]) {
					maxel=array[i][j];
					maxi=i;
					maxj=j;
				}
			}
		}
		for (int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(minel>array[i][j]) {
					minel=array[i][j];
					mini=i;
					minj=j;
				}
			}
		}
		
		temp=array[maxi][maxj];
		array[maxi][maxj]=array[mini][minj];
		array[mini][minj]=temp;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
	}

}
