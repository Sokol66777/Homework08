package com.tc.les08.smallArray;

public class Zadanie04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,5,5,6,0};
		int flag=1;
		for(int i=0;i<array.length;i++) {
			if(i!=array.length-1) {
				if(array[i]>array[i+1]) {
					flag=0;
					System.out.println("Nope");
					return;
				}
			}
		}
		if(flag==1) {
			System.out.println("yep");
		}
	}

}
