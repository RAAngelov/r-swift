package Homework_3;

import java.util.Scanner;

public class Task4f_LongestCommonSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = sc.nextLine();
		System.out.print("Enter a string :");
		String str1 = sc.nextLine();
		int mlen = Math.min(str.length(),str1.length());
		if (str.length() > str1.length()){
			String temp;
			temp = str;
			str = str1;
			str1 = temp;
		}
		char [] Str = str.toCharArray();
		char [] Str1 = str1.toCharArray();
		
		

	}

}
