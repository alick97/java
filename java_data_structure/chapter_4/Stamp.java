/*************************************************************************
	> File Name: Stamp.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月29日 星期二 21时14分58秒
 ************************************************************************/
/* 计算邮资找零钱 
 *
 *  即 输入的数字 有预定的几个数字求和 让和等于输入的数字 且 给定的数字的总次数最小
 *
 *  递归方法
 * */


class Stamp {
	public final static int LETTER=37;
	public final static int CARD = 21;
	public final static int PENNY = 1;

	public static int stampCount(int amount) {
		int minStamps;
		if (amount == 0) return 0;
		minStamps = 1 + stampCount(amount - PENNY);
		if (amount >= CARD) {
			int possible = 1 + stampCount(amount - CARD);
			if (minStamps > possible) {
				minStamps = possible;
			}
		}

		if (amount >= LETTER) {
			int possible = 1+ stampCount(amount - LETTER);
			if (minStamps > possible) {
				minStamps = possible;
			}
		}
		return minStamps;
	}

	public static void main (String[] args) {
		// input 44
		// output 4
        System.out.println(stampCount(44));
	}
}


