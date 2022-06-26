package com.tc.les08.smallArray;
public class Zadanie20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,4,2,6,7,3,7,3,5};
		int count=0;
		int temp;
		for(int i=1;i<array.length;i+=2) {
			array[i]=0;
			count+=1;
		}
		for(int i=0;i<array.length;i++) {
			if(array[i]==0 && i!=array.length-1) {
				for(int j=i+1,p=i;j<array.length;j++) {
					temp=array[p];
					array[p]=array[j];
					array[j]=temp;
					p++;
				}
			}
		}
		for(int i=0;i<array.length-count;i++) {
			System.out.print(array[i]+ " ");
		}
	}

}




