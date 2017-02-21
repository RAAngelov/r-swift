import java.util.Scanner;

public class Task4b_PrintZFigure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements N:");
		int N = sc.nextInt();
		char [] Arr1 = new char [N];
		for (int i = 0;i < N;i++){
			Arr1[i] = '*';
		}
		char [] Arr2 = new char [N];
		for (int i = 0;i < N;i++){
			Arr2[i] = ' ';
		}
		for (int i = 1;i <= N;i++){
			if(i == 1 || i == N){
				System.out.println(Arr1);	
			} else {
				Arr2[N - i] = '*';
				System.out.println(Arr2);
				Arr2[N - i] = ' ';
				
			}
		}
		
	     

	}

}
