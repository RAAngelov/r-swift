package Homework_2;
import java.util.Scanner;

public class Task1e_ReadNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number N:");
		int N = sc.nextInt();
		System.out.print("Enter specific numbers:");
		String str = "";
		for (int i = 0;i < N;i++){
			str += sc.nextInt() + " ";	
		}
		System.out.println(str);

	}

}
