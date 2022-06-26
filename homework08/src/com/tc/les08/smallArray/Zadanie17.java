package com.tc.les08.smallArray;
import java.util.Arrays;
public class Zadanie17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {-8,4,1,-6,3,9,0,11,-7,-8,4,6,8,-8};
		int min=array[0];
		int count=0;
		for(int i=1;i<array.length;i+=2) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		for(int i=0;i<array.length;i++) {
			if(array[i]==min) {
				count+=1;
			}
		}
		int arraycopy[]=new int[array.length-count];
		for(int i=0,j=0;i<array.length;i++) {
			if(array[i]!=min) {
				arraycopy[j]=array[i];
				j+=1;
			}
		}
		System.out.println(Arrays.toString(arraycopy));
	}

}
