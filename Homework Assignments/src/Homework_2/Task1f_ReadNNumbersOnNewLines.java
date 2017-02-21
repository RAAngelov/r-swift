package Homework_2;
import java.util.Scanner;

public class Task1f_ReadNNumbersOnNewLines {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number N:");
		int N = sc.nextInt();
		System.out.print("Enter N numbers : ");
        String str = "";
		for (int i = 0;i < N;i++){
			int M = sc.nextInt();
			str += M + " ";
		
		}
		System.out.print(str);
		
		
		
		
			
			
			
		}

	}


