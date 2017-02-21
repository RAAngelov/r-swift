package Homework_3;
import java.util.Scanner;


public class Task3b_PrintSortedNumbers {

	public static void main(String[] args) {
		System.out.print("Enter number of elements :");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] Arr = new int[N];
		System.out.print("Enter specific elements:");
		for (int i = 0;i < N;i++){
			Arr[i] = sc.nextInt();
	   }
	   for (int i = 0;i < N - 1;i++){
		   for (int j = i + 1;j < N;j++){
			   if(Arr[i] > Arr[j]){
				   int temp = Arr[i];
				   Arr[i] = Arr[j];
				   Arr[j] = temp;
			   }
		   }
	   }
	   System.out.print(Arr[0]);
       for (int i = 1;i < N;i++){
    	   System.out.print(" " + Arr[i]);
    	   
       }
   }
}
