package com.scottdavidson.cards.util;

public class Card {

	public enum Suit {
		HEARTS, DIAMONDS, SPADES, CLUBS
	}

	public final static int ACE = 1;
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;
	public final static int JOKER = 14;

	private final int value;
	private final Suit suit;

	public static Card newCard(int value, Suit suit) {

		if (value > KING || value < ACE) {
			throw new IllegalArgumentException(
					"Illegal card value (1<= value <= 13) : " + value);
		}
		return new Card(value, suit);

	}

	public static Card newJoker() {
		return new Card(JOKER, Suit.CLUBS);
	}

	public int getValue() {
		return value;
	}

	public String getValueAsString() {
		switch (this.value) {
		case ACE:
			return "Ace";
		case 2:
			return "2";
		case 3:
			return "3";
		case 4:
			return "4";
		case 5:
			return "5";
		case 6:
			return "6";
		case 7:
			return "7";
		case 8:
			return "8";
		case 9:
			return "9";
		case 10:
			return "10";
		case JACK:
			return "Jack";
		case QUEEN:
			return "Queen";
		case KING:
			return "King";
		case JOKER:
			return "Joker";
		default:
			return "King";
		}

	}

	public Suit getSuit() {
		return suit;
	}

	public String conciseToString() {

		// If a Joker
		if (getValue() == JOKER) {
			return "{ " + getValueAsString() + " }";
		} else {
			return "{ " + getValueAsString() + ":" + getSuit().toString().substring(0,1) + " }";
		}
	}

	@Override
	public String toString() {

		// If a Joker
		if (getValue() == JOKER) {
			return "{ " + getValueAsString() + " }";
		} else {
			return "{ " + getValueAsString() + " of " + getSuit() + " }";
		}
	}

	private Card(int value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}
}
