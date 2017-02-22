package Homework_3;

import java.util.Scanner;

public class Task4c_CaesarCipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = sc.nextLine();
		System.out.print("Do you wish to decode or encode? :");
		String str1 = sc.nextLine();
		char [] Str = str.toCharArray();
		if (str1.equals("encode")){
		for (int i = 0;i < str.length();i++){
			if (Str[i] == 'z'){
				Str[i] = 'a';
			} else if (Str[i] == 'Z'){
				Str[i] = 'A';
			} else {
				Str[i] = (char) (Str[i] + 1);
			}
		}
			for (int i = 0;i < str.length();i++){
				System.out.print(Str[i]);
			}
		} else if (str1.equals("decode")){
			for (int i = 0;i < str.length();i++){
				if (Str[i] == 'a'){
					Str[i] = 'z';
				} else if (Str[i] == 'A'){
					Str[i] = 'Z';
				} else {
					Str[i] = (char) (Str[i] + 1);
				}
			}
				for (int i = 0;i < str.length();i++){
					System.out.println(Str[i]);
				}
			
			
		}
			
				
			
		}
	}


