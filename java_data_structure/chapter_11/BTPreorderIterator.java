/*************************************************************************
	> File Name: BTPreorderIterator.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月16日 星期五 10时17分20秒
 ************************************************************************/
// 二叉树 迭代器 先序遍历
import java.util.Stack;

class BTPreorderIterator {
    protected BinaryTree root;
	protected Stack todo;
	public BTPreorderIterator(BinaryTree root) {
        todo = new Stack();
		this.root = root;
		reset();
	}

	public void reset() {
		todo.clear();
		if (root != null) todo.push(root);
	}

	public boolean hasNext() {
		return !todo.isEmpty();
	}

	public Object get() {
		return ((BinaryTree)todo.peek()).value();
	}

	public Object next() {
		BinaryTree old = (BinaryTree)todo.pop();
		Object result = old.value();
		if (!old.right().isEmpty()) todo.push(old.right()); 
		if (!old.left().isEmpty()) todo.push(old.left());
		return result;
	}
}
