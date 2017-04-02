package Homework_2;

import java.util.Scanner;

public class Task1c_ReadAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number N:");
		int N = sc.nextInt();
		if (N >= 18){
			System.out.println("YES");
		} else if (N >= 0 && N < 18){
			System.out.println("NO");
		  } else {
			  System.out.println("NO");  
		  }

	}

}
