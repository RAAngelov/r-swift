package Homework_3;
import java.util.Scanner;

public class Task2a_PrintMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements N :");
		int N = sc.nextInt();
		int [][] Arr = new int [N][N];
		for (int row = 0;row < N;row++){
			for (int col = 0;col < N;col++){
				Arr[col][row] = 1 + N*row + col; 
			}
		}
		for(int row = 0;row < N;row++){
			for(int col = 0;col < N;col++){
		System.out.print(Arr[row][col]);
			}
		System.out.println();	
		}


	}

}
