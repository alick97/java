/*************************************************************************
	> File Name: QueueList.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月13日 星期二 18时49分36秒
 ************************************************************************/
// 基于列表的队列

public class QueueList {
	protected CircularList data;

	public QueueList() {
		data = new CircularList();// 循环链表
	}

	public void add(Object value) {
		data.addLast(value);
	}

	public Object remove() {
		return data.removeFirst();
	}

	public Object get() {
		return data.getFirst();
	}

	public int size() {
		return data.size();
	}

	public void clear() {
		data.clear();
	}

	public boolean isEmpty() {
		return data.isEmpty();
	}
}
