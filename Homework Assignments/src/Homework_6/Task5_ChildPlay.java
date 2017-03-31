package Homework_6;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Task5_ChildPlay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack st = new Stack<Integer>();
		for (int i = 0; i < N; i++) {
			st.add(sc.nextInt());
		}
		int count = 0;
		int size = st.size();
		while (!(st.size() == playOneRound(st).size())) {
			count++;
			System.out.println(st);
		}
		System.out.println(count);

	}

	public static Stack playOneRound(Stack st) {
		Stack st1 = new Stack<Integer>();
		while (!st.isEmpty()) {
			int k = (int) st.pop();
			if (!st.isEmpty()) {
				if (k < (int) st.peek()) {
					st1.add(k);
				}
			} else {
				st1.add(k);
			}
		}
		while (!st1.isEmpty()) {
			st.add(st1.pop());
		}
		return st;

	}

}
