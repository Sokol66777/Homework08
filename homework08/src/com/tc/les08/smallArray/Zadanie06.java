package com.tc.les08.smallArray;

public class Zadanie06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {-8,4,1,-6,3,9,0,11,-7};
		int min=array[0];
		int max=array[0];
		int len;
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
			
		System.out.println(max);
		System.out.println(min);
		len=max-min;
		System.out.println(len);
	}

}
