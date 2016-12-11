/*************************************************************************
	> File Name: AbstractIterator.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月11日 星期日 15时45分58秒
 ************************************************************************/
import java.util.*;
public abstract class AbstractIterator implements Enumeration, Iterator {
	public abstract void reset();

	public abstract boolean hasNext();

	public abstract Object get();

	public abstract Object next();

	public void remove() {
		assert true:"Remove not implemented.";
	}

	final public boolean hasMoreElements() {
		return hasNext();
	}

	final public Object nextElement() {
		return next();
	}

	public static void main(String[] args) {
		// 这 个运行出错 只是展示AbstractIterator的常见用法
		Vector v = new Vector();
		AbstractIterator i;
		v.add("hello");
		v.add("world!");

        for (i = (AbstractIterator)v.iterator(); i.hasNext(); i.next()) {
			System.out.print(i.get() + "  ");
		}
		System.out.println();
	}
}
