import java.util.Scanner;

public class Task2d_PrintAllDivisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements N:");
		int N = sc.nextInt();
		for (int i = 1;i <= N;i++){
			if (N % i == 0){
				System.out.print(i + " ");
			}
		}

	}

}
