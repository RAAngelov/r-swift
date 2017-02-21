import java.util.Scanner;

public class Task3d_PrintReverseSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements N:");
		int N = sc.nextInt();
		System.out.print("Enter specific numbers:");
		String str = "";
		for (int i = 1;i <= N;i++){
			int m = sc.nextInt();
			str = m + " " +str;	
		}
		System.out.print(str);

	}

}
