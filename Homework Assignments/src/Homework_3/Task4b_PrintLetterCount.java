package Homework_3;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Character;

public class Task4b_PrintLetterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = sc.nextLine();
		char [] arr = str.toCharArray();
		Arrays.sort(arr);
		for (int i = 0;i < arr.length;i++){
			int count = 1;
			for (int j = i + 1;j < arr.length;j++){
				if (Character.toLowerCase(arr[j]) == Character.toLowerCase(arr[i])){
					count++;
				} else {
					break;
				}
			}
			System.out.println("(" + Character.toLowerCase(arr[i]) + ")" + count);
			i = i + count - 1;
		}
		

	}

}
