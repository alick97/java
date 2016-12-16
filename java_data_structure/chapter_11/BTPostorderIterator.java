/*************************************************************************
	> File Name: BTPostorderIterator.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月16日 星期五 10时42分21秒
 ************************************************************************/
// 二叉树的后序遍历
import java.util.*;

public class BTPostorderIterator {
	protected BinaryTree root;
	protected Stack todo;

	public void reset() {
		todo.clear();
		BinaryTree current = root;
		while (!current.isEmpty()) {
            todo.push(current);
			if (!current.left().isEmpty()) {
				current = current.left();
			} else {
				current = current.right();
			}
		}
	}

	public Object next() {
		BinaryTree current = (BinaryTree)todo.pop();
		Object result = current.value();
		if (!todo.empty()) {
			BinaryTree parent = (BinaryTree)todo.peek();
			if (current == parent.left()) {
				current = parent.right();
				while (!current.isEmpty()) {
					todo.push(current);
					if(!current.left().isEmpty()) {
						current = current.left();
					} else {
						current = current.right();
					}
				}
			}
		}
		return result;
	}
}
