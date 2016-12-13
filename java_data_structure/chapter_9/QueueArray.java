/*************************************************************************
	> File Name: QueueArray.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月13日 星期二 19时46分42秒
 ************************************************************************/
// 基于数组的队列

class QueueArray {
	protected Object[] data;
	protected int head;
	protected int count;

	public QueueArray(int size) {
        data = new Object[size];
		head = 0;
		count = 0;
	}

	public void add(Object value) {
		assert !isFull();
		int tail = (head + count) % data.length;
		data[tail] = value;
		count++;
	}

	public Object remove() {
		assert !isEmpty();
		Object value = data[head];
		head = (head + 1) % data.length;
		count--;
	    return value;
	}

	public Object get() {
		assert !isEmpty();
		return data[head];
	}

	public int size() {
		return count;
	}

	public void clear() {
		count = 0;
		head = 0;
	}
	public boolean isFull() {
		return count == data.length;
	}

	public boolean isEmpty() {
		return count == 0;
	}
}
