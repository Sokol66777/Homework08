package com.tc.les08.bigArray;
import java.util.Scanner;
public class Zadanie40 {
	
	
	private static int [][] createOdd(int n){
		int a=0;
		int b=n/2;
		int array [] []=new int [n][n];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=0;
			}
		}
		array[a][b]=1;
		for (int i=2;i<n*n+1;i++) {
			a=a-1;
			b=b+1;
			if(a<0) {
				a=array.length-1;
			}
			if(b>array.length-1) {
				b=0;
			}
			if(array[a][b]>0) {
				b=b-1;
				a=a+1;
				if (a>array.length-1) {
					a=0;
				}
				if(b<0) {
					b=array.length-1;
				}
				a=a+1;
			}
			array[a][b]=i;
		}
		
		return array;
	}
	
	
	private static int[][] createHalfEven(int n){
		int temp;
		int stolb=0;
		int half=n/2;
		int array[][]=new int[n][n];
		int smallarr[][]=new int [half][half];
		smallarr=createOdd(half);
		for(int i=0;i<half;i++) {
			for(int j=0;j<half;j++) {
				array[i][j]=smallarr[i][j];
			}
		}
		for(int i=0;i<half;i++) {
			for(int j=half;j<array.length;j++)
				array[i][j]=smallarr[i][j-half]+half*half*2;
		}
		for (int i=half;i<array.length;i++) {
			for (int j=0;j<half;j++) {
				array[i][j]=smallarr[i-half][j]+3*half*half;
			}
		}
		for (int i=half;i<array.length;i++) {
			for(int j=half;j<array.length;j++) {
				array[i][j]=smallarr[i-half][j-half]+half*half;
			}
		}
		for(int j=0;j<1;j++) {
			for (int i=0;i<half+1;i=i+half-1) {
				temp=array[i][j];
				array[i][j]=array[i+half][j];
				array[i+half][j]=temp;
			}
		}
		for (int j=1;j<2;j++) {
			for (int i=1;i<half-1;i++) {
				temp=array[i][j];
				array[i][j]=array[i+half][j];
				array[i+half][j]=temp;
				
			}
		}
		
		if(n>6) {
			stolb=(n-6)/2/2;
		}
		
		for(int j=half-stolb;j<half+stolb;j++) {
			for (int i=0;i<half;i++) {
				temp=array[i][j];
				array[i][j]=array[i+half][j];
				array[i+half][j]=temp;
				
				
			}
		}
		
		return array;
	}
	
	
	private static int[][] createEven(int n){
		int array[][]=new int [n][n];
		int fakearray[][]=new int [n][n];
		int element=1;
		int count=0;
		
		
		for(int i=0;i<array.length;i++) {
			for(int j =0;j<array.length;j++) {
				array[i][j]=element;
				element+=1;
			}
		}
		
		element-=1;
		for(int i=0;i<array.length;i++) {
			for(int j =0;j<array.length;j++) {
				fakearray[i][j]=element;
				element-=1;
			}
		}
		
		
		for(int i=0;i<array.length;i+=4) {
			count++;
		}
		
		
		for(int i=0;i<count;i++) {
			for (int j=0;j<count;j++) {
				for(int p=0;p<4;p++) {
					array[p+i*4][p+j*4]=fakearray[p+i*4][p+j*4];
				}
			}
		}
		
		
		for(int i=0;i<count;i++) {
			for(int j=0;j<count;j++) {
				for(int p=0;p<4;p++) {
					
						array[p+i*4][(3-p)+j*4]=fakearray[p+i*4][(3-p)+j*4];
					
				}
			}
		}
		

		return array;
	}
	
	private static void printarray(int array[][]) {
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input size of magic sqare");
		n=sc.nextInt();
		int array[][]=new int [n][n];
		if(n%2!=0) {
			array=createOdd(n);
			
		}
		if(n%2==0 && n%4!=0) {
			array=createHalfEven(n);
		}
		if(n%2==0 && n%4==0) {
			array=createEven(n);
		}
		printarray(array);
	}
}
