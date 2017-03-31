package Homework_6;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Task1_UniqueNumbers {

	public static void main(String[] args) {
		Set<Integer> orderedSet = new LinkedHashSet<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0;i < N;i++){
			orderedSet.add(sc.nextInt());
		}
		printSet(orderedSet);
		}
	private static void printSet(Set<Integer> set) {
        for (Integer i : set) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

}
