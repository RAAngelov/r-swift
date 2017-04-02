package Homework_2;
import java.util.Scanner;

public class Task4c_PrintChristmasTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of elements N:");
		int N = sc.nextInt();
		char [] Arr1 = new char [2*N - 5];
		int size = 2*N - 5;
		for (int i = 0;i < size;i++){
			if(i == size/2){
				Arr1[i] = '*';
			}
			else {
				Arr1[i] = ' ';
			}
	    
		}
		for (int k = 1;k <= N - 3;k++){
			System.out.println(Arr1);
			Arr1[size/2 + k] = '*';
			Arr1[size/2 - k] = '*';
		}
		System.out.println(Arr1);
		for (int k = 1;k <= N - 3;k++){
			Arr1[size/2 + k] = ' ';
			Arr1[size/2 - k] = ' ';
		}
		System.out.println(Arr1);
		Arr1[size/2 + 1] = '*';
		Arr1[size/2 - 1] = '*';
		System.out.println(Arr1);
		
	
		

	}

}
