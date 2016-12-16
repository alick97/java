/*************************************************************************
	> File Name: BTPostorderIteratorR.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月16日 星期五 12时21分23秒
 ************************************************************************/
//中序的递归 方式
import java.util.LinkedList;
import java.util.Queue;

public class BTPostorderIteratorR {
	protected BinaryTree root;
	protected Queue todo;

	public BTPostorderIteratorR() {
		todo = new LinkedList();
		this.root = root;
		reset();
	}

	public void reset() {
		todo.clear();
		enqueuePostorder(root);
	}

	protected void enqueuePostorder(BinaryTree current) {
		if (current.isEmpty()) return;

		enqueuePostorder(current.left());
		enqueuePostorder(current.right());
		todo.offer(current);
	}

	public Object next() {
		BinaryTree current = (BinaryTree)todo.poll();
		if (current == null) {
			return null;
		} else {
			return current.value();
		}
	}


}
