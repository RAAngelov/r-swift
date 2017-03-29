package Homework_7;

@CardsAnnotation(type = "class",category = "CardGames",
description = "Represents a card object used to play games with")
public class Card implements Comparable<Card> {
	public @interface CardsAnnotation {
	    String type();
	    String category();
	    String description();
	}
	
	CardSuit cs;
	CardRank cr;

	Card() {
		cs = cs.Clubs;
		cr = cr.Two;
	}

	Card(CardSuit cs, CardRank cr) {
		this.cs = cs;
		this.cr = cr;
	}
	@CardsAnnotation(type = "enum",category = "CardGames",
     description = "Contains a set of constants for the suits of a card.")
	public enum CardSuit {
		Clubs(0), Diamonds(1), Hearts(2), Spades(3);

		private final int value;

		private CardSuit(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

	}
	@CardsAnnotation(type = "enum",category = "CardGames",
		     description = "Contains a set of constants for the ranks of a card.")
	public enum CardRank {
		Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(
				13), Ace(14);

		private final int value;

		private CardRank(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	@Override
	public int compareTo(Card o) {
		if (cs.getValue() > o.cs.getValue()) {
			return 1;
		}
		if (cs.getValue() < o.cs.getValue()) {
			return -1;
		}
		return 0;
	}

	public String toString() {
		return cr + " of " + cs;
	}
	

}

