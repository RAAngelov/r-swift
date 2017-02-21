package Homework_3;
import java.util.Scanner;

public class Task3f_LargestSumKSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number N:");
		int N = sc.nextInt();
		System.out.print("Enter a number K:");
		int K = sc.nextInt();
		System.out.print("Enter " + N + " numbers :");
		int [] Arr = new int[N];
		for (int i = 0;i < Arr.length;i++){
			Arr[i] = sc.nextInt();
		}
		int cmaxSUM = 0;
		for(int i = 0;i < K;i++){
			cmaxSUM += Arr[i];
		}
		int cmaxInd = 0;
		for (int i = 1;i <= Arr.length - K;i++){
			int cSUM = 0;
			for (int j = i;j < i + K;j++){
				cSUM += Arr[j];
			}
			if (cSUM > cmaxSUM) {
				cmaxSUM = cSUM;
				cmaxInd = i;
			}
			
		}
		System.out.print(Arr[cmaxInd]);
		for (int i = cmaxInd + 1;i < cmaxInd + K;i++){
			
			System.out.print(" " + Arr[i]);
		
		}
	}

}
