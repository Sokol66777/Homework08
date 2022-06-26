package com.tc.les08.smallArray;

public class Zadanie19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {4,1,2,2,5,6,2,6,4,4,1,1};
		int count;
		int a=0;
		int arraynum=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			count=1;
			if(i!=array.length-1) {
				for(int j=i+1;j<array.length;j++) {
					if(array[i]==array[j]) {
						count+=1;
					}
					if(a<count) {
						a=count;
						arraynum=array[i];
					}
					else if(a==count) {
						if(arraynum>array[i]) {
							arraynum=array[i];
						}
					}
				}
			}
		}
		System.out.println("most popular " +arraynum);
	}

}
