package Homework_3;

import java.util.Scanner;

public class Task4e_BracketMatching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = sc.nextLine();
		char [] Str = str.toCharArray();
		int length = Str.length;
		if (length % 2 != 0 || !((Str[0] == '(' && Str[length - 1] == ')') ||
				(Str[0] == '[' && Str[length - 1] == ']') ||
				(Str[0] == '{' && Str[length - 1] == '}'))){
			System.out.println("false");
		} else if (length == 2 && (Str[0] == '(' && Str[length - 1] == ')') ||
				(Str[0] == '[' && Str[length - 1] == ']') ||
				(Str[0] == '{' && Str[length - 1] == '}')){
			System.out.println("true");	
		} else {
		boolean flag = true;
		for (int K = 0;K <= length - 2;K += 2){
			for (int i = 1;i + K < length - 2;i++){
				if ((Str[i] == '(' && Str[i + K + 1] == ')') ||
						(Str[i] == '[' && Str[i + K + 1] == ']') ||
						(Str[i] == '{' && Str[i + K + 1] == '}')){
					for (int j = i + 1;j <= i + K;j++){
						if (Str[j] != '0'){
							flag = false;
						}
					}
					    if (flag){
					        Str[i] = '0';
					        Str[i + K + 1] = '0';
					    }
				}	
		    }
		}
        for (int i = 1;i < length - 1;i++){
        	if(Str[i] != '0'){
        		flag = false;
        	}
        }
        if (flag){
        	System.out.println(flag);
        } else {
        	System.out.println(flag);
         }
		
		}
         
		
	}

}
