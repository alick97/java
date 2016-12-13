/*************************************************************************
	> File Name: Queue.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月13日 星期二 18时38分34秒
 ************************************************************************/
// 队列

public interface Queue extends Linear {
	public void add(Object value);

	public void enqueue(Object value); // 入队

	public Object remove();

	public Object dequeue(); // 出队

	public Object getFirst();

	public Object get();

	public Object peek();

	public boolean empty();

	public int size();
}
