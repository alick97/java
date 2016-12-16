/*************************************************************************
	> File Name: BTLevelorderIterator.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月16日 星期五 10时56分50秒
 ************************************************************************/
// 二叉树的层序遍历
import java.util.Queue;
import java.util.LinkedList;

public class BTLevelorderIterator {
	protected BinaryTree root;
	protected Queue todo;

	public BTLevelorderIterator(BinaryTree root) {
		todo = new LinkedList();
		this.root = root;
		reset();
	}

	public void reset() {
		todo.clear();
		if (!root.isEmpty())
			todo.add(root);
	}

	public boolean hasNext() {
		return !todo.isEmpty();
	}

	public Object get() {
		return ((BinaryTree)todo.peek()).value();
	}

	public Object next() {
		BinaryTree current = (BinaryTree)todo.poll();
		Object result = current.value();
		if (!current.left().isEmpty())
			todo.add(current.left());
		if (!current.right().isEmpty()) {
			todo.add(current.right());
		}

		return result;
	}

}
