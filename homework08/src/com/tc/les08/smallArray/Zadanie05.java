package com.tc.les08.smallArray;
import java.util.Arrays;
import java.util.Random;
public class Zadanie05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Random rand=new Random();
		int array1[]= {1,3,3,3,7,9};
		//int array1[]=new int[9];
		//for(int i=0;i<9;i++) {
			//array1[i]=rand.nextInt(20);
		//}
		//System.out.println(Arrays.toString(array1));
		for(int i =0;i<array1.length;i++) {
			if(array1[i]%2==0) { //На сколько я знаю 0-четное число поэтому не исключал его
				count+=1;
			}
		}
		if(count==0) {
			System.out.println("Array no have even numbers");
			return;
		}
		int array2[]=new int[count];
		for(int i =0,j=0;i<array1.length;i++) {
			if(array1[i]%2==0) { 
				array2[j]=array1[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(array2));
	}

}
