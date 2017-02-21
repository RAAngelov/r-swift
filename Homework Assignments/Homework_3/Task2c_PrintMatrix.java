import java.util.Scanner;

public class Task2c_PrintMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements N :");
		int N = sc.nextInt();
		int [][] Arr = new int [N][N];
		Arr[0][0] = 1;
		Arr[N - 1][N - 1] = N*N;
		for (int i = 1;i <= N - 1;i++){
			if (i % 2 != 0){
				int j = 0;
				int k = i;
				while(j <= i){
				Arr[k][j] = ((i + 2)*(i + 1))/2 - j;
				Arr[N - k - 1][N - j - 1] = N*N + 1 - Arr[k][j];
				k--;
				j++;
				}
			} else {
				int j = 0;
				int k = i;
				while(j <= i){
				Arr[j][k] = ((i + 2)*(i + 1))/2 - j;
				Arr[N - j - 1][N - k - 1] = N*N + 1 - Arr[j][k];
				k--;
				j++;
				}
				
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
