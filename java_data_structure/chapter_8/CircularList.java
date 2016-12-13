/*************************************************************************
	> File Name: CircularList.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月12日 星期一 19时04分15秒
 ************************************************************************/
// 循环链表


class CircularList {
	protected int count;
	protected SinglyLinkedListElement tail;
	public CircularList() {
		tail = null;
		count = 0;
	}

	public void addFirst(Object value) {
		SinglyLinkedListElement temp = new SinglyLinkedListElement(value);
		if (tail == null) {
			tail = temp;
			tail.setNext(tail);
		} else {
			temp.setNext(tail.next());
			tail.setNext(temp);
		}
		count++;
	}

	public void addLast(Object value) {
		addFirst(value);
		tail = tail.next();
	}

	public Object removeLast() {
		assert count > 0;
		SinglyLinkedListElement finger = tail;
		while (finger.next() != tail) {
			finger = finger.next();
		}

		SinglyLinkedListElement temp = tail;
		if (finger == tail) {
			tail = null;
		} else {
			finger.setNext(tail.next());
			tail = finger;
		}
		count--;
		return temp.value();
	}

	public Object removeFirst() {
		assert count > 0;
		SinglyLinkedListElement finger = null;
		if (tail.next() != tail) {
			finger = tail.next();
			tail.setNext(finger.next());
		} else {
			finger = tail;
			tail = null;
		}

		count--;
		return finger.value();
	}

	public Object getFirst() {
		return tail.next().value();
	}

	public int size() {
		return count;
	}

	public void clear() {
		tail = null;
		count = 0;
	}

	public boolean isEmpty() {
		return count == 0;
	}
    
}
