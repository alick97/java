/*************************************************************************
	> File Name: PFGenerator.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月11日 星期日 16时21分29秒
 ************************************************************************/
/* 数字迭代器 (素数因子)
 * 符合迭代器接口类似于生成器的类
 * */

public class PFGenerator extends AbstractIterator {
	protected int n;
	protected int f;
    protected int base;

	public PFGenerator(int value) {
        base = value;
		reset();
	}

	public void reset() {

		n = base;
		f = 2;
	}

	public boolean hasNext() {
		return f <= n;
	}

	public Object  next() {
        Object result = get();
		n /= f;
		return result;
	}

	public Object get() {
		while (f <= n && n % f != 0) f++;
		return new Integer(f);
	}

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			int n = Integer.parseInt(args[i]);
			PFGenerator g = new PFGenerator(n);

			System.out.print(n + ": ");
			while (g.hasNext()) {
				System.out.print(g.next() + " ");
			}
			System.out.println();
		}
	}
}
