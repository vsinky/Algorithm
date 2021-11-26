package com.bridgelabz.algorithm;
import java.util.Scanner;

public class SortingAlgorithm {
	static int binarySearch(String[] arr, String str) {

		int index = 0;
		while (index < arr.length) {

			if (str.equals(arr[index])) {
				return index;
			}
			index++;
		}
		return -1;
	}

	static void insertionSort(String arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			String key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		printArray(arr);
	}

	static void printArray(String arr[]) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
