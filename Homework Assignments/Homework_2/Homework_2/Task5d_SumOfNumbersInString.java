package Homework_2;
import java.util.Scanner;

public class Task5d_SumOfNumbersInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String Str = sc.nextLine();
		char [] str = Str.toCharArray();
		int size = str.length;
		int SUM = 0;
		for (int i = 0;i < size;i++){
			if (str[i] == '0' || str[i] == '1' || str[i] == '2'
				|| str[i] == '3' || str[i] == '4'  || str[i] == '5'
				|| str[i] == '6' || str[i] == '7'  || str[i] == '8'
				|| str[i] == '9') {
				int number = (int) (str[i] - '0');
				if (i + 1 < size){
					while(str[i + 1] == '0' || str[i + 1] == '1' || str[i + 1] == '2'
							|| str[i + 1] == '3' || str[i + 1] == '4'  || str[i + 1] == '5'
							|| str[i + 1] == '6' || str[i + 1] == '7'  || str[i + 1] == '8'
							|| str[i + 1] == '9'){
						number *= 10;
						number += str[i + 1] - '0';
						i++;
						if (i >= size - 1){
							break;
						}
					}
				}
				SUM += number;
				
				}
		}
		System.out.print(SUM);
		    
		
		
		
		
	}
}


