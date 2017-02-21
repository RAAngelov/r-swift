package Homework_3;
import java.util.Scanner;

public class Task1c_ReadArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements :");
		int N = sc.nextInt();
		System.out.print("Enter specific numbers:");
		int [] Arr = new int [N];
		for (int i = 0;i < N;i++){
			Arr[i] = sc.nextInt();
			
		}
		System.out.print(Arr[0]);
		for (int i = 1;i < N;i++){
		System.out.print(" " + Arr[i]);
		}
		
		

	}

}
