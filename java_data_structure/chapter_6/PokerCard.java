/*************************************************************************
	> File Name: PokerCard.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月03日 星期六 16时45分55秒
 ************************************************************************/
public class PokerCard extends AbstractCard {
	public PokerCard(int face, int suit) {
        set(suit * 13 + face - 1 );
	}

	public PokerCard () {

	}

	public int Value() {
		if (face() == ACE) return KING + 1;
		else return face();
	}

	public int compareTo(Object other) {
		PokerCard that = (PokerCard) other;
		return this.value() - that.value();
	}
}
