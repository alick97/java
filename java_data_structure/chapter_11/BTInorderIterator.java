/*************************************************************************
	> File Name: BTInorderIterator.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月16日 星期五 10时32分13秒
 ************************************************************************/
// 二叉树的中序遍历
//
import java.util.Stack;

public class BTInorderIterator {
	protected BinaryTree root;
	protected Stack todo;
	public void reset() {
		todo.clear();
		BinaryTree current = root;
		while (current != BinaryTree.EMPTY) {
			todo.push(current);
			current = current.left();
		}
	}

	public Object next() {
		BinaryTree old = (BinaryTree)todo.pop();
		Object result = old.value();
		if (!old.right().isEmpty()) {
			BinaryTree current = old.right();
			do {
				todo.push(current);
				current = current.left();
			}  while (!current.isEmpty());
		}
		return result;
	}


}
