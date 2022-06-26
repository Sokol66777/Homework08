package com.tc.les08.bigArray;

public class Zadanie40recurs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[9];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		printAllRecursive(array.length, array);
	}

	public static void printAllRecursive(int n, int[] elements) {
		int a = elements[0] + elements[1] + elements[2];
		int b = elements[3] + elements[4] + elements[5];
		int c = elements[6] + elements[7] + elements[8];
		int a1 = elements[0] + elements[3] + elements[6];
		int b1 = elements[1] + elements[4] + elements[7];
		int c1 = elements[2] + elements[5] + elements[8];
		int a2 = elements[0] + elements[4] + elements[8];
		int b2 = elements[2] + elements[4] + elements[6];
		if (n == 1 && a == b && b == c && a1 == b1 && b1 == c1 && a == a2 && b == b2) {
			System.out.print('\n');
			for (int i = 0; i < elements.length; i++) {
				if (i % 3 == 0) {
					System.out.println();
				}
				System.out.print(elements[i]);
			}
			System.out.println();
			System.out.println();
		} else if (n == 1 && (a != b || b != c || a != c || a1 != a || b1 != b || c1 != c || b2 != b || a2 != a)) {
			return;
		} else {
			for (int i = 0; i < n - 1; i++) {
				printAllRecursive(n - 1, elements);
				if (n % 2 == 0) {
					int tmp = elements[i];
					elements[i] = elements[n - 1];
					elements[n - 1] = tmp;
				} else {
					int tmp = elements[0];
					elements[0] = elements[n - 1];
					elements[n - 1] = tmp;

				}
			}
			printAllRecursive(n - 1, elements);
		}
	}
}
