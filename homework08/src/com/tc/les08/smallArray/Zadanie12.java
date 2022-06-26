package com.tc.les08.smallArray;

public class Zadanie12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,3,5,7,2,1,2,3,4,56,6,7,8,9};
		int flag;
		int number;
		int sum=0;
		for(int i=1;i<array.length;i++) {
			flag=1;
			number=i+1;
			for(int j=2;j<number;j++) {
				if(number%j==0) {
					flag=0;
				}	
			}
			if (flag==1) {
				sum+=array[i];
				System.out.println(array[i]);
			}
		}
		System.out.println(sum);
	}

}
