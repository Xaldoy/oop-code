package hr.fer.oop.util;

import java.util.Arrays;

public class ArrayRandomSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 23, 23, 2, 1, 2 };
		swap(arr);
		for (int a : arr)
			System.out.println(a);
	}

	static void swap(int[] arr) {
		int temp;
		int[] indexes = new int[3];
		indexes[0] = (int) (arr.length * Math.random());
		do {
			indexes[1] = (int) (arr.length * Math.random());
		} while (indexes[1] == indexes[0]);
		do {
			indexes[2] = (int) (arr.length * Math.random());
		} while (indexes[2] == indexes[1] || indexes[2] == indexes[0]);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < indexes.length; j++) {
				if (indexes[j] < indexes[i]) {
					temp = indexes[i];
					indexes[i] = indexes[j];
					indexes[j] = temp;
				}
			}
		}
		for (int index : indexes)
			System.out.println(index);
		System.out.println();

		temp = arr[indexes[0]];
		arr[indexes[0]] = arr[indexes[1]];
		arr[indexes[1]] = arr[indexes[2]];
		arr[indexes[2]] = temp;

	}
}
