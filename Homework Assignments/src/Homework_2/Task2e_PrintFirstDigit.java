package Homework_2;
import java.util.Scanner;

public class Task2e_PrintFirstDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements N:");
		int N = sc.nextInt();
		while (N/10 != 0){
			N /= 10;
		}
		System.out.print(N);

	}

}
