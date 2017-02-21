package Homework_3;
import java.util.Scanner;


public class Task3h_PrintOddFrequenctNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number N:");
		int N = sc.nextInt();
		System.out.print("Enter " + N + " numbers :");
		int [] Arr = new int[N];
		for (int i = 0;i < Arr.length;i++){
			Arr[i] = sc.nextInt();
		}
		for (int i = 0;i < N;i++){

			int count = 1;
			for (int j = i + 1;j < N;j++){
				if (Arr[j] == Arr[i]){
					count++;			
					}
				}
			
			if (count % 2 != 0){
				System.out.println(Arr[i]);
				
				}
			
		}
		
		

	}

}
