package com.tc.les08.smallArray;

public class Zadanie03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {0,0,0,5,3,-4};
		for (int i=0;i<array.length;i++) {
			if(array[i]>0) {
				System.out.println("Positive");
				return;
			}
			else if(array[i]<0) {
				System.out.println("Negative");
				return;
			}
		}

	}

}
