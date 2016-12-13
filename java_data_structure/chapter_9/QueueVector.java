/*************************************************************************
	> File Name: QueueVector.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月13日 星期二 19时04分16秒
 ************************************************************************/
// 基于向量的队列
import java.util.*;

public class QueueVector {
	protected Vector data;

	public QueueVector() {
		data = new Vector();
	}

	public QueueVector(int size) {
		data = new Vector(size);
	}

	public void add(Object value) {
		data.add(value);
	}

	public Object remove() {
		return data.remove(0);
	}
}
