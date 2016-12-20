/*************************************************************************
	> File Name: PriorityVector.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月20日 星期二 10时55分23秒
 ************************************************************************/
// 基于向量的 优先级队列

import java.util.*;

public class PriorityVector{
	protected Vector data;

	public PriorityVector() {
		data = new Vector();
	}

	public Comparable getFirst() {
		assert !data.isEmpty();
		return (Comparable)data.get(0);
	}

	public Comparable remove() {
		Comparable result = (Comparable)data.get(0);
		data.remove(0);
		return result;
	}

	// add 
}
