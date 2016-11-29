/*************************************************************************
	> File Name: FiboNoRe.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月29日 星期二 21时53分03秒
 ************************************************************************/
class FiboNoRe {
	static long fibo(int n) {
		long a = 0;
		long b = 1;
		if (n == 0) return a;
		if (n == 1) return b;
		int i = 2;
		long F = 0;
		do {
			F = a + b;
			a = b;
			b = F;
			i++;
		} while (i <= n);

		return F;
	}

	public static void main(String[] args) {
		System.out.println(fibo(94));
	}
}
