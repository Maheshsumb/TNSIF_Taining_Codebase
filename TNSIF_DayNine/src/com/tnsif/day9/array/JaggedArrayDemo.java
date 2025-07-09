package com.tnsif.day9.array;

public class JaggedArrayDemo {
	public static void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2 }, {  6 }, { 7, 8, 9 } };
		printArray(arr);
	}

}
