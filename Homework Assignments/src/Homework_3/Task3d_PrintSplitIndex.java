package Homework_3;
import java.util.Arrays;
import java.util.Scanner;

public class Task3d_PrintSplitIndex {

	public static void main(String[] args) {
		System.out.print("Enter number of elements :");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] Arr = new int[N];
		System.out.print("Enter specific elements:");
		for (int i = 0;i < N;i++){
			Arr[i] = sc.nextInt();
		}
		int S = Arrays.stream(Arr).sum(); // sum of Arr elements
		int SumIndex = 0; // sum of Arr elements from 0 to the current index
		for(int i = 0;i < Arr.length;i++){
			SumIndex += Arr[i];
			if(SumIndex == (S - SumIndex)){
				System.out.println(Arr[i]);
				break;
			} else if(SumIndex == S){
				System.out.println("NO");
				
			}
		
		}
		
		
		
		
		
		
		

	}

}
