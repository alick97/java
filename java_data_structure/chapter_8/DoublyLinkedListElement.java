/*************************************************************************
	> File Name: DoublyLinkedListElement.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月12日 星期一 17时08分07秒
 ************************************************************************/
/* 双链表元素节点*/
class DoublyLinkedListElement {
	protected Object data;
	protected  DoublyLinkedListElement nextElement;
	protected DoublyLinkedListElement previousElement;

	public DoublyLinkedListElement(Object v, DoublyLinkedListElement next, DoublyLinkedListElement previous) {
		data = v;
		nextElement = next;
		if (nextElement != null)
			nextElement.previousElement = this;
		previousElement = previous;
		if (previousElement != null)
			previousElement.nextElement = this;
	}

    public DoublyLinkedListElement(Object v) {
		this(v, null, null);
	}

	public Object value() {
		return data;
	}

	public void setNext(DoublyLinkedListElement next) {
		this.nextElement = next;
	}

	public void setPrevious(DoublyLinkedListElement prev) {
		this.previousElement = prev;
	}

	public DoublyLinkedListElement previous() {
		return previousElement;
	}

	public DoublyLinkedListElement next() {
		return nextElement;
	}
}
