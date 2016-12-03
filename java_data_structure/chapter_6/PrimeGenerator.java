/*************************************************************************
	> File Name: PrimeGenerator.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月03日 星期六 16时01分43秒
 ************************************************************************/
/* 素数生成器 */
public class PrimeGenerator extends AbstractGenerator {
	public PrimeGenerator () {
		reset();
	}

	public void reset() {
		set(2);
	}

	public int next() {
		// 产生下一个素数

		int f, n = get();

		do {
			if (n == 2) 
				n = 3;
			else 
				n += 2;

			// 判断是不是素数
			for (f = 2; f * f <= n; f++) {
				if (n % f == 0)
					break;
			}

		} while (f*f <= n);
		set(n);
		return n;
	}

	public static void main(String[] args) {
	    PrimeGenerator pg = new PrimeGenerator();
		for (int i = 0; i < 2100000000; i++) {
			System.out.println(pg.next());
		}
	}
}
