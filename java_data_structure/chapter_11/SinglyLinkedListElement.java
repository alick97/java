/*************************************************************************
	> File Name: SinglyLinkedListElement.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月12日 星期一 15时13分29秒
 ************************************************************************/
// 单链表节点元素

public class SinglyLinkedListElement {
	protected Object data;
	protected SinglyLinkedListElement nextElement;

	public SinglyLinkedListElement(Object v, SinglyLinkedListElement next) {
		data = v;
		nextElement = next;
	}

	public SinglyLinkedListElement(Object v) {
		this(v, null);
	}

	public SinglyLinkedListElement next() {
		return nextElement;
	}

	public void setNext(SinglyLinkedListElement next) {
		nextElement = next;
	}

	public Object value() {
		return data;
	}

	public void setValue(Object value) {
		data = value;
	}
}
