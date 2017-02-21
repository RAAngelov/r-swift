import java.util.Scanner;

public class Task2f_PrintMirrorNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number N:");
		int N = sc.nextInt();
		int M;
		while (N != 0){
			M = N % 10;
			N /= 10;
			System.out.print(M);	
		}

	}

}
