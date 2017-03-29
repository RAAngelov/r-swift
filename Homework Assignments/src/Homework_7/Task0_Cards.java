package Homework_7;

public class Task0_Cards {
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

	public enum CardRank {
		Two(0), Three(1), Four(2), Five(3), Six(4), Seven(5), Eight(6), Nine(7), Ten(8), Jack(9), Queen(10), King(
				11), Ace(12);

		private final int value;

		private CardRank(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public static void main(String[] args) {
		printEnum(CardSuit.values());
		System.out.println();
		printEnum(CardRank.values());
	}

	public static <T extends Enum<T>> void printEnum(T[] aValues) {
		for (T d : aValues) {
			System.out.print(d + "," + " ");
		}
	}

}

