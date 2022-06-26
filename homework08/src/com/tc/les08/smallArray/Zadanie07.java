package com.tc.les08.smallArray;
import java.util.Arrays;
public class Zadanie07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Z=11;
		int array[]= {1,7,4,99,3,156,6,353};
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>Z) {
				array[i]=Z;
				count+=1;
			}
		}
		System.out.println(Arrays.toString(array)+"\nCount="+count);
	}

}
