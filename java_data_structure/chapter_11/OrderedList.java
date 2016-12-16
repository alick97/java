/*************************************************************************
	> File Name: OrderedList.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月14日 星期三 20时33分13秒
 ************************************************************************/
// 有序列表
import java.util.Comparator;
import java.util.Iterator;

public class OrderedList {
	protected SinglyLinkedListElement data;
	protected Comparator ordering;
	protected int count;

	public OrderedList() {
		this(new NaturalComparator());
	}

	public OrderedList(Comparator ordering) {
		this.ordering = ordering;
		clear();
	}

	public void clear() {
		data = null;
		count = 0;
	}

	public boolean contains(Object value) {
		SinglyLinkedListElement finger = data;
		Comparable cValue = (Comparable)value;
		while ((finger != null) && ordering.compare(finger.value(), cValue) < 0) {
			finger = finger.next();
		}

		return finger != null && cValue.equals(finger.value());
	}

	public void add(Object value) {
		SinglyLinkedListElement previous = null;
		SinglyLinkedListElement finger = data;
		Comparable cValue = (Comparable) value;
		while ((finger != null) && ordering.compare(finger.value(), cValue ) < 0) {
			previous = finger;
			finger = finger.next();
		}

		if (previous == null) {
			data = new SinglyLinkedListElement(cValue, data);
		} else {
            previous.setNext(new SinglyLinkedListElement(cValue, previous.next()));
		}

		count++;
	}

	public Object remove(Object value) {
		SinglyLinkedListElement previous = null;
		SinglyLinkedListElement finger = data;
		Comparable cValue = (Comparable) value;
		while ((finger != null) && ordering.compare(finger.value(), cValue) < 0) {
			previous = finger;
			finger = finger.next();
		}
		if (  finger != null && cValue.equals(finger.value())) {
            if (previous == null) {
				data = finger.next();
			} else {
				previous.setNext(finger.next());
			}
			count--;
			return finger.value();
		}

		return null;
	}
	public Iterator iterator() {
		return new SinglyLinkedListIterator(data);
	}

	int size() {
		return count;
	}
}
