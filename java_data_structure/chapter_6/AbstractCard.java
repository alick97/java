/*************************************************************************
	> File Name: AbstractCard.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月03日 星期六 16时30分43秒
 ************************************************************************/
import java.util.Random;

public abstract class AbstractCard implements Card {
	protected int cardIndex;
	protected static Random gen = new Random();
	public AbstractCard() {
		set(randomIndex(52));
	}

	protected static int randomIndex(int max) {
		return Math.abs(gen.nextInt()) % max;
	}

	protected void set(int index) {
		cardIndex = index;
	}

	protected int get() {
		return cardIndex;
	}

	public int suit() {
		return cardIndex / 13; // 花色
	}

	public int face() {
		return (cardIndex % 13) + 1;
	}

	public boolean isWild() {
		return false; // default is false
	}

	public int value() {
		return face();
	}

	public String toString() {
		String cardName = "";
		switch (face()) {
			case ACE: cardName = "Ace"; break;
			case JACK: cardName = "Jack"; break;
			case QUEEN: cardName = "Queen"; break;
			case KING: cardName = "King"; break;
			default : cardName = cardName + face(); break;
		}

		switch (suit()) {
			case HEARTS: cardName += " of Hearts"; break;
			case DIAMONDS: cardName += " of Diamonds"; break;
			case CLUBS: cardName += " of Clubs"; break;
			case SPADES: cardName += " of Spades"; break;
		}

		return cardName;
	}
}
