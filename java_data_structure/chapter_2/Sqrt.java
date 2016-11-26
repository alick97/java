/*************************************************************************
	> File Name: Sqrt.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月26日 星期六 15时56分17秒
 ************************************************************************/
/**
 * 计算平方根
 *
 */

class Sqrt {
	public static double sqrt(double x) {
		// pre: x 是 非负的
		// post: 返回x的平方根
		assert x>=0 : "the value is noonegative";
		double guess = 1.0;
		double guessSquared = guess * guess;

		while (Math.abs(x - guessSquared) >= 0.00000001) {
			guess += (x - guessSquared) / 2.0 / guess;
			guessSquared = guess * guess;
		}

		return guess;
	}

	public static void main(String[] args)
	{
    	System.out.println("sqrt 9 -> " + sqrt(9) );
    	System.out.println("sqrt 11 -> " + sqrt(11) );
	}
}
