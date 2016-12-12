/*************************************************************************
	> File Name: SinglyLinkedList.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月12日 星期一 15时20分05秒
 ************************************************************************/
// 单链表
class SinglyLinkedList {
	protected int count;
	protected SinglyLinkedListElement head;

	public SinglyLinkedList() {
		head = null;
		count = 0;
	}

	public int size() {
		return count;
	}

	public int sizeSlow() {
		int elementCount = 0;
		SinglyLinkedListElement finger = head;
		while (finger != null) {
			elementCount++;
			finger = finger.next();
		}
		return elementCount;
	}

	public void addFirst(Object value) {
		head = new SinglyLinkedListElement(value, head);
		count++;
	}

	public Object removeFirst() {
		assert head != null;
		SinglyLinkedListElement temp = head;
		head = head.next();
		count--;
		return temp.value();
	}

	public Object getFirst() {
		return head.value();
	}

	public void addLast(Object value) {
		SinglyLinkedListElement temp = new SinglyLinkedListElement(value, null);
		if (head != null) {
			SinglyLinkedListElement finger = head;
			while (finger.next() != null) {
				finger = finger.next();
			}
			finger.setNext(temp);
		} else {
			head = temp;
		}
		count++;
	}

	public Object removeLast() {
		assert head != null;
		SinglyLinkedListElement finger = head;
		SinglyLinkedListElement prev = null;
		while (finger.next() != null) {
			prev = finger;
			finger = finger.next();
		}

		if (prev == null) {
			head = null;
		} else {
			prev.setNext(null);
		}
		count--;
		return finger.value();
	}

	public boolean contains(Object value) {
		SinglyLinkedListElement finger = head;
		while (finger != null && !finger.value().equals(value)) {
			finger = finger.next();
		}
		return finger != null;
	}

	public Object remove(Object value) {
		SinglyLinkedListElement finger = head;
		SinglyLinkedListElement prev = null;
		while (finger != null && !finger.value().equals(value)) {
			prev = finger;
			finger = finger.next();
		}

		if (finger != null) {
			if (prev == null) {
				head = finger.next();
			} else {
				prev.setNext(finger.next());
			}
			count--;
			return finger.value();
		}
		return null;
	}

	public void clear() {
		head = null;
		count = 0;
	}

	public void add(int i, Object o) {
		assert i >= 0 && i <= size();
		if (i == size()) {
			addLast(o);
		} else if (i == 0) {
			addFirst(o);
		} else {
			SinglyLinkedListElement prev = null;
			SinglyLinkedListElement finger = head;
			while (i > 0) {
				prev = finger;
				finger = finger.next();
				i--;
			}
            
			SinglyLinkedListElement cur = new SinglyLinkedListElement(o, finger);
			count++;
			prev.setNext(cur);

		}
	}

	public Object remove(int i) {
        assert i >= 0 && i < size();
		if (i == 0) 
			return removeFirst();
		else if (i == size() - 1)
			return removeLast();
		SinglyLinkedListElement finger = head;
		SinglyLinkedListElement prev = null;
		while (i > 0) {
            prev = finger;
			finger = finger.next();
			i--;
		}

		prev.setNext(finger.next());
		count--;
		return finger.value();

	}

}
