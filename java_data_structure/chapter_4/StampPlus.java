/*************************************************************************
	> File Name: StampPlus.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月29日 星期二 21时27分06秒
 ************************************************************************/
/*  邮资找零钱问题的优化版本    
 *  运用动态规划 利用额外的数组记录已经计算的情况 减少重复的递归 提高效率
 *
 * */


class StampPlus {
	public static final int LETTER = 37;
	public static final int CARD = 21;
	public static final int PENNY = 1;

    public static int stampCount(int amount) {
		assert amount >= 0;
		return stampCount(amount, new int[amount + 1]); 
	}


	protected static int stampCount(int amount, int[] answer) {
        int minStamps;
		if (amount == 0) {
			return 0;
		}

		if (answer[amount] != 0) {
			return answer[amount];
		}

		minStamps = 1 + stampCount(amount - PENNY, answer);
		if (amount >= CARD) {
			int possible = 1 + stampCount(amount - CARD, answer);
			if (minStamps > possible) 
				minStamps = possible;
		}

		if (amount >= LETTER) {
			int possible = 1 + stampCount(amount - LETTER, answer);
			if (minStamps > possible) {
				minStamps = possible;
			}
		}
		answer[amount] = minStamps;

		return minStamps;
	}


	public static void main(String[] args) {
	    System.out.println(stampCount(44)); // 4
	}
}
