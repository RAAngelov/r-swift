package Homework_6;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2_CommonSubset {

	public static void main(String[] args) {
		Set<Integer> orderedSet = new LinkedHashSet<>();
		Set<Integer> orderedSet1 = new LinkedHashSet<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		for (int i = 0;i < N;i++){
			orderedSet.add(sc.nextInt());
		}
		for (int i = 0;i < M;i++){
			orderedSet1.add(sc.nextInt());
		}
		orderedSet.retainAll(orderedSet1);
		if(!orderedSet.isEmpty()){
		printSet(orderedSet);}
		else {
			System.out.println("NO");
		}
		
		}
	private static void printSet(Set<Integer> set) {
        for (Integer i : set) {
            System.out.print(i + " ");
        }

        System.out.println();
	}

}
