package com.tc.les08.smallArray;

public class Zadanie16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,4,6,1,2,34,4,2,4,5};
		int n=5;
		int max=array[0]+array[9];
		for(int i=0;i<n;i++) {
			if(array[i]+array[2*n-i-1]>max) {
				max=array[i]+array[2*n-i-1];
			}
			System.out.println(array[i]+"+"+array[2*n-i-1]);
			System.out.println();
		}
		System.out.println("max="+max);

	}

}
