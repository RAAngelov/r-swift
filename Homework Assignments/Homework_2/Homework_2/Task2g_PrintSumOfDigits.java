package Homework_2;
import java.util.Scanner;

public class Task2g_PrintSumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements N:");
		int N = sc.nextInt();
		int M;
		int SUM = 0;
		while (N != 0){
			M = N % 10;
			SUM += M;
			N /= 10;
		}
		System.out.print(SUM);	

	}

}
