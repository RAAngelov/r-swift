package Homework_6;

import java.util.Stack;
import java.util.Scanner;
import java.util.*;

public class Task3_ParenthesesMatching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack st = new Stack();
		char[] str1 = str.toCharArray();
		for (int i = 0; i < str1.length; i++) {
			if (str1[i] == '(' || str1[i] == '{' || str1[i] == '[') {
				st.add(str1[i]);
			} else if (str1[i] == ')' && ((char) st.peek() == '{' || (char) st.peek() == '[')
					|| str1[i] == '}' && ((char) st.peek() == '(' || (char) st.peek() == '[')
					|| str1[i] == ']' && ((char) st.peek() == '{' || (char) st.peek() == '(')) {

				System.out.println("False");
				break;

			} else if ((str1[i] == ']' && (char) st.peek() == '[') || (str1[i] == ')' && (char) st.peek() == '(') ||

			(str1[i] == '}' && (char) st.peek() == '{')) {
				st.pop();
			}
		}
		if (st.isEmpty()) {
			System.out.println("True");
		}

	}

}
