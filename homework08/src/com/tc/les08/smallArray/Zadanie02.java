package com.tc.les08.smallArray;
import java.util.Arrays;
public class Zadanie02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int array1[]={5,1,0,0,5,5,5,3,0,5,0,4,9,94,0};
		for(int i=0;i<array1.length;i++) {
			if(array1[i]==0) {
				count +=1;
			}
		}
		int array2[]=new int[count];
		for(int i=0, j=0;i<array1.length;i++) {
			if(array1[i]==0) {
				array2[j]=i;
				j++;
			}
		}
		System.out.println(Arrays.toString(array2));
	}

}
