/*************************************************************************
	> File Name: AbstractQueue.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月13日 星期二 18时43分10秒
 ************************************************************************/
public abstract class AbstractQueue extends AbstractLinear implements Queue {
	public void enqueue(Object item) {
		add(item);
	}

	public Object dequeue() {
		return remove();
	}

	public Object getFirst() {
		return get();
	}

	public Object peek() {
		return get();
	}
}
