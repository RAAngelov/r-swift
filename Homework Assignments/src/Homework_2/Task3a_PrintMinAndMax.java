import java.util.Scanner;

public class Task3a_PrintMinAndMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements N:");
		int N = sc.nextInt();
		System.out.print("Enter specific numbers:");
		int [] Arr = new int [N];
		for (int i = 0;i < N;i++){
			Arr[i] = sc.nextInt();	
		}
		int max = Arr[0];
		int min = Arr[0];
		
			for(int j = 1;j < Arr.length;j++){
				if(Arr[j] > max){
					max = Arr[j];
					}
			}
			for(int j = 1;j < Arr.length;j++){
				if(Arr[j] < min){
					min = Arr[j];
					}
			}
		System.out.print(min + " ");
		System.out.print(max);
		
			
			
			
		}
		

	}


