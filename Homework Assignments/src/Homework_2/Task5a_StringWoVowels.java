package Homework_2;
import java.util.Scanner;

public class Task5a_StringWoVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String Str = sc.nextLine();
		char [] str = Str.toCharArray();
		for (int i = 0;i < str.length;i++){
			if(str[i] != 'a' && str[i] != 'o' && str[i] != 'e'
					&& str[i] != 'i' && str[i] != 'u' &&
					str[i] != 'A' && str[i] != 'O' && str[i] != 'E'
					&& str[i] != 'I' && str[i] != 'U'){
				System.out.print(str[i]);
			}
		}

	}

}
