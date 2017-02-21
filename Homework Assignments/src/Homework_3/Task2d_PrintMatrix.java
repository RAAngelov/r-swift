package Homework_3;
import java.util.Scanner;

public class Task2d_PrintMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements :");
		int N = sc.nextInt();
		int [][] Arr = new int [N][N];
		int i = 0;
		int j = 0;
		int count = 1;
		for (int k = 1;k <= N/2;k++){
			while(j < N - k + 1){
				Arr[i][j] = count;
				count++;
				j++;
			}
			i++;
			j--;
			while(i < N - k + 1){
				Arr[i][j] = count;
				count++;
				i++;
			}
			i--;
			j--;
			while(j >= k - 1){
				Arr[i][j] = count;
				count++;
				j--;
			}
			i--;
			j++;
			while(i >= k){
				Arr[i][j] = count;
				count++;
				i--;
			}
			i++;
			j++;
			
			
		}
		if (N % 2 != 0){
			Arr[N/2][N/2] = N*N;
		}
		for(int row = 0;row < N;row++){
			for(int col = 0;col < N;col++){
		System.out.print(Arr[row][col]);
			}
		System.out.println();	
		}

	}

}
