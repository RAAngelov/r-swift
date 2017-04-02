package Homework_5.OOP_Debugging;

import java.util.Scanner;

public class Task1_CalculatorClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		while (!(str = sc.nextLine()).equalsIgnoreCase("END")) {
			String arr[] = str.split(" ", 3);
			if (arr[0].equals("SUM")) {
				System.out.println(Calculator.sum(Double.parseDouble(arr[1]), Double.parseDouble(arr[2])));
			} else if (arr[0].equals("SUB")) {
				System.out.println(Calculator.subtract(Double.parseDouble(arr[1]), Double.parseDouble(arr[2])));
			} else if (arr[0].equals("MUL")) {
				System.out.println(Calculator.multiply(Double.parseDouble(arr[1]), Double.parseDouble(arr[2])));
			} else if (arr[0].equals("DIV")) {
				System.out.println(Calculator.divide(Double.parseDouble(arr[1]), Double.parseDouble(arr[2])));
			} else if (arr[0].equals("PER")) {
				System.out.println(Calculator.percentage(Double.parseDouble(arr[1]), Double.parseDouble(arr[2])));
			}

		}

	}

}
