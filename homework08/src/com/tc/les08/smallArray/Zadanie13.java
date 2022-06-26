package com.tc.les08.smallArray;

public class Zadanie13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,56,6,3,787,33,73,7,2};
		int M=2;
		int count=0;
		int L=2;
		int N=7;
		for(int i=L;i<=N;i++) {
			if(array[i]%M==0) {
				count+=1;
			}
		}
		System.out.print(count);
	}

}
