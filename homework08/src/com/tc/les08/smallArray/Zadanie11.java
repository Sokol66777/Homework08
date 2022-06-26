package com.tc.les08.smallArray;

public class Zadanie11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {32,4,6,12,3,7,5,3,22};
		int M=10;
		int L=2;
		for(int i=0;i<array.length;i++) {
			if(array[i]%M==L) {
				System.out.print(array[i]+" ");
			}
		}
	}

}
