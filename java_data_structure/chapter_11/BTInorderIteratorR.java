/*************************************************************************
	> File Name: BTInorderIteratorR.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016骞�12鏈�16鏃� 鏄熸湡浜� 12鏃�21鍒�23绉�
 ************************************************************************/
//涓簭鐨勯�掑綊 鏂瑰紡
import java.util.LinkedList;
import java.util.Queue;

public class BTInorderIteratorR {
	protected BinaryTree root;
	protected Queue todo;

	public BTInorderIteratorR() {
		todo = new LinkedList();
		this.root = root;
		reset();
	}

	public void reset() {
		todo.clear();
		enqueueInorder(root);
	}

	protected void enqueueInorder(BinaryTree current) {
		if (current.isEmpty()) return;

		enqueueInorder(current.left());
		todo.offer(current);
		enqueueInorder(current.right());
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
