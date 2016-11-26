/*************************************************************************
	> File Name: Pi.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月26日 星期六 14时46分44秒
 ************************************************************************/
/*
 * 有一个令人惊异的事实：如果使用两个随机的整数， a, b > 0,
 * 构造一个Ratio， 则a/b 已经是最简式的概率为 6/(pi^2) .
 * 用这一事实编写一个程序计算 pi  的近似值。
 * */

import java.util.Random;

class Pi {
	static int gcb(int a, int b) {
		// 计算最大公约数

		if (a == 0 && b == 0) {
			return 1;
		}

		while (a != 0 && b != 0) {
			if (a < b) 
				b %= a;
			else
				a %= b;
		}

		return a + b;
	}

	public static void main(String[] args) {
        int least = 0;
		int trials = 1000000;
        Random g = new Random();

		for (int i = 0; i < trials; i++) {
			if (gcb(Math.abs(g.nextInt())% 10000, Math.abs(g.nextInt()) % 10000) == 1 )
				least++;
		}

		System.out.println("Pi is : " + Math.sqrt(6.0 * trials / least));

	}
}
