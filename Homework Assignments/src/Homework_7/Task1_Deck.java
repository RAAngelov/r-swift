package Homework_7;

import Homework_7.Card.CardRank;
import Homework_7.Card.CardSuit;

public class Task1_Deck {

	public static void main(String[] args) {
		for (CardSuit d : CardSuit.values()) {
			for (CardRank e : CardRank.values()) {
				Card card = new Card(d, e);
				System.out.println(card.toString());

			}
		}

	}

}
