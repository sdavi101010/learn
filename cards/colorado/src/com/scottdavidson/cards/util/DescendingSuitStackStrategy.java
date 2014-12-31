package com.scottdavidson.cards.util;

public class DescendingSuitStackStrategy extends AbstractSuitStackStrategy {
	
	public static DescendingSuitStackStrategy newDescendingSuitStackStrategy(Card.Suit suit) {
		return new DescendingSuitStackStrategy(suit);
	}

	@Override
	public boolean cardCanBePushed(Card topCard, Card candidateCard) {

		// Let the abstract parent do its check first ...
		if ( !super.cardCanBePushed(topCard, candidateCard)) {
			return false;
		}
		
		// No other tests (yet)
		return true;
	}
	
	protected int requiredValueOfFirstCard() {
		return Card.KING;
	}

	private DescendingSuitStackStrategy(Card.Suit suit) {
		super(suit);
	}

}
