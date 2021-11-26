package com.bridgelabz.algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		String str1, str2;
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String : ");
		str1 = sc.next();
		System.out.println("Enter the Second String : ");
		str2 = sc.next();
		if (str1.length() == str2.length())
			check = isAnagram(str1, str2);
		System.out.println(check);

	}

	private static boolean isAnagram(String str1, String str2) {
	
		char[] ch1 = str1.replaceAll("[\\s]", "").toCharArray();
		char[] ch2 = str2.replaceAll("[\\s]", "").toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean check=Arrays.equals(ch1,ch2);
		return check;
	}
}
