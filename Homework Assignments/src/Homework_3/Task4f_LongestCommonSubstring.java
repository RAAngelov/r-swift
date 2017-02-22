package Homework_3;

import java.util.Scanner;
import java.util.Arrays;

public class Task4f_LongestCommonSubstring {
	public static char [] getSubstring(int ind,int L,char [] myString){
		char [] str1 = new char [L];
		for (int i = 0;i <= L - 1;i++){
			str1[i] = myString[i + ind];
		}

		return str1;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = sc.nextLine();
		System.out.print("Enter a string :");
		String str1 = sc.nextLine();
		int mlen = Math.min(str.length(),str1.length());
		if (str.length() > str1.length()){
			String temp;
			temp = str;
			str = str1;
			str1 = temp;
		}
		char [] Str = str.toCharArray();
		char [] Str1 = str1.toCharArray();
		boolean flag = false;
		for (int L = mlen;L >= 1;L--){
			if(flag){
				break;
			}
			for (int i = 0;i < mlen - L + 1 ;i++){
				if(flag){
					break;
				}
				for (int j = 0;j < Str1.length - L + 1;j++){
					if(flag){
						break;
					}
					if(Arrays.equals(getSubstring(j,L,Str1),getSubstring(i,L,Str))){
	                    char [] ch = getSubstring(j,L,Str1);
	                    for (int m = 0;m < L;m++){
	                    	System.out.print(ch[m]);
	                    }
						flag = true;
						break;
					}

				}
			}
		}
	}

}
