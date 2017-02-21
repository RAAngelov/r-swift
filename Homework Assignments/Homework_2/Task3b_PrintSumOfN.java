import java.util.Scanner;

public class Task3b_PrintSumOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements N:");
		int N = sc.nextInt();
		System.out.print("Enter specific numbers:");
		int sum = 0;
		for (int i = 1;i <= N;i++){
			sum += sc.nextInt();
			
		}
		
		System.out.print(sum);

	}

}
