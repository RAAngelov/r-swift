import java.util.Scanner;

public class Task3i_FindKInSorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number N:");
		int N = sc.nextInt();
		System.out.print("Enter a number K:");
		int K = sc.nextInt();
		System.out.print("Enter specific numbers :");
		int Arr [] = new int [N];
		for (int i = 0;i < N;i++){
			Arr[i] = sc.nextInt();
		}
		int leftend = 0;
		int rightend = N;
		int i = (leftend + rightend)/2;
		int k = 1;
		while (k <= (N/2 + 1)){
		    i = (leftend + rightend)/2;
			if (Arr[i] == K)	{
				System.out.print(i);
				break;
			} else if (Arr[i] > K){
				rightend = i;
				k++;
			} else {
				leftend = i;
				k++;
			}
			}
		if (k > (N/2 + 1)){
		System.out.print("NO");
		}
		
		
	}

}
