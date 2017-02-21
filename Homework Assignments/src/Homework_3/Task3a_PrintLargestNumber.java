import java.util.Scanner;

public class Task3a_PrintLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number N:");
		int N = sc.nextInt();
		System.out.print("Enter specific numbers :");
		int Arr [] = new int [N];
		for (int i = 0;i < N;i++){
			Arr[i] = sc.nextInt();
		}
		int max = Arr[0];
		for (int i = 1;i < Arr.length;i++){
			if (Arr[i] > max){
				max = Arr[i];
			}
		}
		System.out.print(max);

	}

}
