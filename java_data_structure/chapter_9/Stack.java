/*************************************************************************
	> File Name: Stack.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月13日 星期二 16时43分52秒
 ************************************************************************/
// 堆
public interface Stack extends Linear {
	public void add(Object item);

	public void push(Object item);

	public Object remove();

	public Object pop();

	public Object get();

	public Object getFirst();

	public Object peek();
	// post: top value (next to be popped ) is returned

	public boolean empty();

	public int size();
}
