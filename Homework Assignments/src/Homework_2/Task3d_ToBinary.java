package Homework_2;
import java.util.Scanner;

public class Task3d_ToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of elements N:");
		int N = sc.nextInt();
		int size = 0;
		int M = N;
		while(M != 0){
			size += 1;
			M /= 2;
		}
		int [] Arr = new int [size];
		M = N;
		for (int i = size - 1;i >= 0;i--){
			N %= 2;
			Arr[i] = N;
			M = M/2;
			N = M;
		}
		for (int i = 0;i < size;i++){
			System.out.print(Arr[i]);
		}
		
		

	}

}
