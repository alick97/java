/*************************************************************************
	> File Name: Card.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月03日 星期六 16时24分22秒
 ************************************************************************/
/* 纸牌的接口 */

public interface Card {
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int JOKER = 14;
	public static final int CLUBS = 0;
	public static final int DIAMONDS = 1;
	public static final int HEARTS = 2;
	public static final int SPADES = 3;
    
	public int face();
		// 纸牌面值
    public boolean isWild();

	public int value();

	public int compareTo(Object other);

	public String toString();
}
