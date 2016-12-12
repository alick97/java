/*************************************************************************
	> File Name: SinglyLinkedListIterator.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月12日 星期一 19时15分51秒
 ************************************************************************/
// 列表迭代器


class SinglyLinkedListIterator {
	protected SinglyLinkedListElement current;
	protected SinglyLinkedListElement head;

	public SinglyLinkedListIterator(SinglyLinkedListElement t) {
		head = t;
		reset();
	}

	public void reset() {
		current = head;
	}

	public boolean hasNext() {
		return current != null;
	}

	public Object next() {
		Object temp = current.value();
		current = current.next();
		return temp;
	}
}
