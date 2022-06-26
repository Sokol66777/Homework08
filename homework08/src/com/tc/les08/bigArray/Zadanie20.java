package com.tc.les08.bigArray;

public class Zadanie20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Мне что-то захотелось сделать немного иначе задачу, поэтому я вместо заполнения по новой
		//перевернул матрицу из предыдущей задачи на 90 градусов
		int array[][]=new int [8][8];
		int array2[][]=new int [8][8];
		int p=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i;j<array[i].length-i;j++) {
				array[i][j]=1;
			}
		}
		for(int i=array.length-1;i>=0;i--) {
			for(int j=p;j<array[i].length-p;j++) {
				array[i][j]=1;
			}
			p++;
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("[%4d]",array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array2[j][array.length-1-i]=array[i][j];
			}
		}
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				System.out.printf("[%4d]",array2[i][j]);
			}
			System.out.println();
		}
	}

}
