package com.tc.les08.smallArray;
import java.util.Arrays;
public class Zadanie18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int [10];
		int indexarray[]=new int [2];
		int temp;
		for (int i=0;i<2;i++) {
		indexarray[i]=(int)(Math.random()*9);
		}
		if (indexarray[0]>indexarray[1]) {
			temp=indexarray[0];
			indexarray[0]=indexarray[1];
			indexarray[1]=temp;
		}
		for(int i=0;i<2;i++) {
			array[indexarray[i]]=(int)(Math.random()*5+1);
		}
		if(indexarray[1]-indexarray[0]>2) {
			
			array[indexarray[0]+1]=(10-array[indexarray[0]])/2;
			array[indexarray[0]+2]=10-array[indexarray[0]]-array[indexarray[0]+1];
			
		}
		else if (indexarray[1]-indexarray[0]==2) {
			if(array[indexarray[0]]+array[indexarray[1]]<10) {
				
				array[indexarray[0]+1]=10-array[indexarray[0]]-array[indexarray[1]];
			}
			else if (indexarray[0]>1) {
				
				array[indexarray[0]-1]=(10-array[indexarray[0]])/2;
				array[indexarray[0]-2]=10-array[indexarray[0]]-array[indexarray[0]-1];
			}
			else {
				
				array[indexarray[1]+1]=(10-array[indexarray[1]])/2;
				array[indexarray[1]+2]=10-array[indexarray[1]]-array[indexarray[1]+1];
			}
		}
		else if (indexarray[1]-indexarray[0]==1) {
			if (array[indexarray[0]]+array[indexarray[1]]<10) {
				if (indexarray[0]==0) {
					
					array[indexarray[1]+1]=10-array[indexarray[0]]-array[indexarray[1]];
					
				}
				else {
					
					array[indexarray[0]-1]=10-array[indexarray[0]]-array[indexarray[1]];
				}
			}
			else if (indexarray[0]>1){
				
				array[indexarray[0]-1]=(10-array[indexarray[0]])/2;
				array[indexarray[0]-2]=10-array[indexarray[0]]-array[indexarray[0]-1];
			}
			else {
				
				array[indexarray[1]+1]=(10-array[indexarray[1]])/2;
				array[indexarray[1]+2]=10-array[indexarray[1]]-array[indexarray[1]+1];
			}
				
		}
		System.out.println(Arrays.toString(indexarray));
		System.out.println(Arrays.toString(array));
	}

}
