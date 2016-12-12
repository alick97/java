/*************************************************************************
	> File Name: DoublyLinkedList.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月12日 星期一 17时19分54秒
 ************************************************************************/
// 双链表
class DoublyLinkedList {
	protected int count;
	protected DoublyLinkedListElement head;
	protected DoublyLinkedListElement tail;
	public DoublyLinkedList() {
		head = null;
		tail = null;
		count = 0;
	}

	public void addFirst(Object value) {
		head = new DoublyLinkedListElement(value, head, null);
		if (tail == null) {
			tail = head;
		}
		count++;
	}


	public void addLast(Object value) {
		tail = new DoublyLinkedListElement(value, null, tail);
		if (head == null) {
			head = tail;
		}
		count++;
	}

	public Object removeLast() {
		assert count > 0;

		DoublyLinkedListElement temp = tail;
		tail = tail.previous();
		if (tail == null) {
			head = null;
		} else {
			tail.setNext(null);
		}

		count--;
		return temp.value();
	}


	public Object remove(Object value) {
		DoublyLinkedListElement finger = head;
		while (finger != null && !finger.value().equals(value)) {
			finger = finger.next();
		}

		if (finger != null) {
			if (finger.previous() != null) {
				finger.previous().setNext(finger.next());
			} else {
				head = finger.next();
			}

			if (finger.next() != null) {
				finger.next().setPrevious(finger.previous());
			} else {
				tail = finger.previous();
			}
			count--;
			return finger.value();
		}
		return null;
	}

	public int size() {
		return count;
	}

	public int lastIndexOf(Object value) {
		int i = count - 1;
		DoublyLinkedListElement finger = tail;
		while (finger != null && !finger.value().equals(value)) {
			finger = finger.previous();
			i--;
		}

		if (finger == null) {
			return -1;
		} else {
			return i;
		}
	}
}
