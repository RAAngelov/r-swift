package Homework_2;
import java.util.Scanner;

public class Task2a_PrintSumOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements N:");
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 1;i <= N;i++){
			sum += i;	
		}
		System.out.print(sum);

	}

}
