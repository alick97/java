/*************************************************************************
	> File Name: Ratio.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月25日 星期五 20时47分35秒
 ************************************************************************/

/*   两个整数的比率   的简单对象  */


public class Ratio {
	protected int numerator; // 分子
	protected int denominator; // 分母

	public Ratio(int top, int bottom) {
		numerator = top;
		denominator = bottom;
		reduce(); // 化简
	}


	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public double getValue() {
		return (double)numerator/(double) denominator;
	}

	public Ratio add(Ratio other) {
		return new Ratio(this.numerator * other.getDenominator() + this.denominator * other.getNumerator(), this.denominator * other.getDenominator());
	}

	protected void reduce() {
		int divisor = gcd(numerator, denominator); // 最大公因子
		numerator /= divisor;
		denominator /= divisor;
	}

	// 辗转相除法 的 递归写法
	protected static int gcd(int a, int b) {
		// a,b >= 0
		if (a == 0) {
			if (b == 0) 
				return 1;
			else
				return b;
		}
		if (b < a) return gcd(b, a);
		return gcd(b%a, a);
	}

	public String toString() {
		return getNumerator() + "/" + getDenominator();
	}


	public static void main(String[] args) {
		Ratio r = new Ratio(1, 1); // 1.0
		r = new Ratio(1,2);        // 0.5
		r = r.add(new Ratio(2, 8)); // 0.75
		System.out.println(r);
	}
}
