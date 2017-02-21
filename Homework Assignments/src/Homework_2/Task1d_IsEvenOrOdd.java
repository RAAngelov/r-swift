package Homework_2;
import java.util.Scanner;

public class Task1d_IsEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number N:");
		int N = sc.nextInt();
		if(N%2 == 0){
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}

	}

}
