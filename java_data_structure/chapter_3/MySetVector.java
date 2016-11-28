/*************************************************************************
	> File Name: MySetVector.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年11月27日 星期日 22时22分47秒
 ************************************************************************/
/* 基于向量的集合 */

import java.util.*;

public class MySetVector {
    protected Vector data;

	public MySetVector() {
		data = new Vector();
	}

	public MySetVector(MySetVector other) {
		this();
		addAll(other);
	}

	public Object remove(Object e) {
		return data.remove(e);
	}

	public void add(Object e) {
		if (!data.contains(e)) data.add(e); // 保证元素唯一
	}

	public void addAll(MySetVector other) {
		Iterator yourElements = other.data.iterator();
		while (yourElements.hasNext()) {
			add(yourElements.next());
		}
	}

	public static void main(String[] args) {
		MySetVector sv = new MySetVector();
		sv.add(new Integer(1));
		sv.add(new Integer(2));
		sv.add(new Integer(3));
		sv.add(new Integer(3));
		MySetVector svc = new MySetVector(sv);
		sv.remove(2);
		svc.add(4);
	}
}
