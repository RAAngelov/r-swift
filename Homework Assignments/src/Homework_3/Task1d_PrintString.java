package Homework_3;

import java.util.Scanner;

public class Task1d_PrintString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = sc.nextLine();
		char [] arr = str.toCharArray();
		for (int k = 0;k < arr.length;k++){
			System.out.println(arr[k]);
			
		}

	}

}
