import java.util.Scanner;

public class Task2h_IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements N:");
		int N = sc.nextInt();
		if(N == 2){
			System.out.print(true);
		}
		for (int i = 2;i <= N/2;i++){			
			if(N % i == 0){
				System.out.print(false);
				break;
			}
			if(i == N/2){
				System.out.print(true);
			}
			
			
		}
		
		
		}

	}


