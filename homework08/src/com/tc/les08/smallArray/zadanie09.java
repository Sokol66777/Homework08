package com.tc.les08.smallArray;
import java.util.Arrays;
public class zadanie09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {-8,4,1,-6,3,9,0,11,-7};
		int min=array[0];
		int max=array[0];
		int maxindex=0;
		int minindex=0;
		int len;
		int temp;
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				maxindex=i;
			}
		}
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				minindex=i;
			}
		}
		temp=array[maxindex];
		array[maxindex]=array[minindex];
		array[minindex]=temp;
		System.out.println(Arrays.toString(array));
	}

}
