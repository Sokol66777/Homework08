package com.tc.les08.smallArray;

public class Zadanie08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {-1,-5,0,5,-6,0,6};
		int pos=0;
		int neg=0;
		int zero=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>0) {
				pos+=1;
			}
			else if(array[i]<0) {
				neg+=1;
			}
			else {
				zero+=1;
			}
		}
		System.out.println("positive="+pos);
		System.out.println("negative="+neg);
		System.out.println("zero="+zero);
	}

}
