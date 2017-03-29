package Homework_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task3_War {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String d1 = sc.nextLine();
		String[] D1 = d1.split(" ");
		Queue<Integer> Deck1 = getDeckQ(D1);
		String d2 = sc.nextLine();
		String[] D2 = d2.split(" ");
		Queue<Integer> Deck2 = getDeckQ(D2);
		System.out.println(Deck1);
		System.out.println(Deck2);
		int count = 0;
		while (!Deck1.isEmpty() && !Deck2.isEmpty()) {
			playOneRound(Deck1, Deck2);
			System.out.println(Deck1);
			System.out.println(Deck2);
			count++;
		}
		System.out.println(count);

	}

	static int whoWinsAtWar(Queue<Integer> d1, Queue<Integer> d2) {
		Queue<Integer> q1 = new LinkedList<>(d1);
		Queue<Integer> q2 = new LinkedList<>(d2);
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < 3 && !q1.isEmpty() && !q2.isEmpty(); i++) {
			sum1 += q1.poll();
			sum2 += q2.poll();
		}
		if (sum1 > sum2) {
			return 1;
		} else if (sum1 < sum2) {
			return 2;
		} else {
			return 0;
		}
	}

	static void playOneRound(Queue<Integer> d1, Queue<Integer> d2) {
		if (d1.peek() > d2.peek()) {
			d1.add(d1.poll());
			d1.add(d2.poll());
		} else if (d1.peek() < d2.peek()) {
			d2.add(d2.poll());
			d2.add(d1.poll());
		} else {
			d1.poll();
			d2.poll();
			if (whoWinsAtWar(d1, d2) == 1) {
				for (int i = 0; i < 3 && !d1.isEmpty() && !d2.isEmpty(); i++) {
					d1.add(d1.poll());
				}
				for (int i = 0; i < 3 && !d1.isEmpty() && !d2.isEmpty(); i++) {
					d1.add(d2.poll());
				}
			} else if (whoWinsAtWar(d1, d2) == 2) {
				for (int i = 0; i < 3 && !d1.isEmpty() && !d2.isEmpty(); i++) {
					d2.add(d2.poll());
				}
				for (int i = 0; i < 3 && !d1.isEmpty() && !d2.isEmpty(); i++) {
					d2.add(d1.poll());
				}
			} else {
				for (int i = 0; i < 3 && !d1.isEmpty() && !d2.isEmpty(); i++) {
					d1.poll();
					d2.poll();
				}
			}

		}
	}

	static Queue<Integer> getDeckQ(String[] s) {
		Queue<Integer> Deck = new LinkedList<>();
		for (int i = 0; i < s.length; i++) {
			switch (s[i].toCharArray()[0]) {
			case '2':
				Deck.add(2);
				break;
			case '3':
				Deck.add(3);
				break;
			case '4':
				Deck.add(4);
				break;
			case '5':
				Deck.add(5);
				break;
			case '6':
				Deck.add(6);
				break;
			case '7':
				Deck.add(7);
				break;
			case '8':
				Deck.add(8);
				break;
			case '9':
				Deck.add(9);
				break;
			case 'T':
				Deck.add(10);
				break;
			case 'J':
				Deck.add(11);
				break;
			case 'Q':
				Deck.add(12);
				break;
			case 'K':
				Deck.add(13);
				break;
			default:
				Deck.add(14);
				break;
			}
		}
		return Deck;
	}

}
