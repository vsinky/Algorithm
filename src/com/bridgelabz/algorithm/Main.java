package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String string = "An,algorithm,is,a,set,of,instructions,for,solving,logical,and,mathematical,problems";
		String[] stringArray = string.split(",");

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter:for insertion sorting ");
		int num = scanner.nextInt();

		switch (num) {
		case 1:
			System.out.println("enter a word to search");
			String str = scanner.next();
			int result = SortingAlgorithm.binarySearch(stringArray, str);

			if (result == -1)
				System.out.println("Element not present");
			else
				System.out.println("Element found at " + "index " + result);
			break;
		case 2 :
			SortingAlgorithm.insertionSort(stringArray);
			break;
		default :
			System.out.println("enter valid case number ");
		}
	}
}
