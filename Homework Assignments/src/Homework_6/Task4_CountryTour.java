package Homework_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Task4_CountryTour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> st = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			int M = sc.nextInt();
			int K = sc.nextInt();
			st.add(K - M);
		}
		System.out.println(st);
		int city = 1;
		int sum = 0;
		int k = 1;
		if (doesSolutionExist(st)) {
			while (!st.isEmpty()) {
				sum += (int) st.poll();
				System.out.println(sum);
				if (sum < 0) {
					sum = 0;
					city += k;
					k = 1;
				}
				System.out.println(st);
				k++;
			}
			System.out.println(city);
		} else {
			System.out.println("NO");
		}

	}

	public static boolean doesSolutionExist(Queue st) {
		int sum = 0;
		Queue<Integer> st1 = new LinkedList<>();
		st1.addAll(st);
		while (!st1.isEmpty()) {
			sum += st1.poll();
		}
		return (sum >= 0);
	}

}
