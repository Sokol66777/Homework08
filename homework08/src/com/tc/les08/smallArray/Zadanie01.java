package com.tc.les08.smallArray;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Zadanie01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int sum=0;
		int K=3;
		Random rand = new Random(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Input length of array");
		N=sc.nextInt();
		int array[] =new int [N];
		for (int i=0;i<N;i++) {
			array[i]=rand.nextInt(20);
		}
		for(int i =0; i<N;i++) {
			if(array[i]%K==0) {
				sum+=array[i];
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Sum="+sum);
		
		
	}

}
