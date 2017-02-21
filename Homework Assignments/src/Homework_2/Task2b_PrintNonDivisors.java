package Homework_2;
import java.util.Scanner;

public class Task2b_PrintNonDivisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements N:");
		int N = sc.nextInt();
		for (int i = 1;i <= N;i++){
			if (i%3 != 0 && i%7 != 0){
			System.out.print(i + " ");
			
		}

	}

}
}
