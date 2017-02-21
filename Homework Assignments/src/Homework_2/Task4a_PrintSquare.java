package Homework_2;
import java.util.Scanner;

public class Task4a_PrintSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of elements N:");
		int N = sc.nextInt();
		char [] Arr1 = new char [N];
		Arr1[0] = '*';
		for (int i = 1;i < N - 1;i++){
			Arr1[i] = ' ';
		}
		Arr1[N - 1] = '*';
		char [] Arr2 = new char [N];
		for (int i = 0;i < N;i++){
			Arr2[i] = '*';
		}
		for (int i = 1;i <= N;i++){
			if(i == 1 || i == N){
				System.out.println(Arr2);	
			} else {
				System.out.println(Arr1);
			}
		}
		
		
	}

}
