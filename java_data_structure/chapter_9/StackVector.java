/*************************************************************************
	> File Name: StackVector.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月13日 星期二 17时23分59秒
 ************************************************************************/
// 基于向量的堆栈
import java.util.*;
public class StackVector {
	protected Vector data;
	public StackVector() {
		data = new Vector();
	}

	public StackVector(int size) {
		data = new Vector(size);
	}

	public void add(Object item) {
		data.add(item);
	}

	public void push(Object item) {
		data.add(item);
	}

	public Object pop() {
		return data.remove(size() - 1);
	}

	public Object remove() {
		return data.remove(size() - 1);
	}

	public Object get() {
		return data.get(size() - 1);
	}
	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return data.size();
	}

	public void clear() {
		data.clear();
	}
}
