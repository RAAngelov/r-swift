package Homework_3;

import java.util.Scanner;

public class Task4a_IsPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = sc.nextLine();
		char [] arr = str.toCharArray();
		for (int k = 0;k < arr.length/2;k++){
			if (arr[k] != arr[arr.length - k - 1]){
				System.out.println("false");
				break;
			}
		}
		System.out.println("true");


	}

}
