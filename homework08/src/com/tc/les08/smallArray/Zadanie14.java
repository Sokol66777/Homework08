package com.tc.les08.smallArray;

public class Zadanie14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {-8,4,1,-6,3,9,0,11,-7};
		int min=array[1];
		int max=array[2];
		int sum;
		for(int i=2;i<array.length;i+=2) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		for(int i=1;i<array.length;i+=2) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		System.out.println("max in even=" + max);
		System.out.println("min in not even="+min);
		sum=min+max;
		System.out.println("Sum="+sum);
	}

}
