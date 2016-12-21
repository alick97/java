/*************************************************************************
	> File Name: BinarySearchTree.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月21日 星期三 13时31分22秒
 ************************************************************************/
// 二分查找树
import java.util.*;

public class BinarySearchTree {
	protected BinaryTree root;
	protected int count;
	protected Comparator ordering;

	public BinarySearchTree() {
		this(new NaturalComparator());
	}

	public BinarySearchTree(Comparator alternateOrder) {
		root = BinaryTree.EMPTY;
		count = 0;
		ordering = alternateOrder;
	}

    protected BinaryTree locate(BinaryTree root, Object value) {
		// 返回找到的value的位置 或 是需要添加的位置
		Object rootValue = root.value();
		BinaryTree child;

		if (rootValue.equals(value)) {
			return root;
		}

		if (ordering.compare(rootValue, value) < 0) {
			child = root.right();
		} else {
			child = root.left();
		}

		if (child.isEmpty()) {
			return root;
		} else {
			return locate(child, value);
		}
	}

    public boolean contains(Object value) {
		if (root.isEmpty()) return false;
		BinaryTree possibleLocation = locate(root, value);
		return value.equals(possibleLocation.value());
	}

    public void add(Object value) {
		BinaryTree newNode = new BinaryTree(value);
		if (root.isEmpty()) {
			root = newNode;
		} else {
			BinaryTree insertLocation = locate(root, value);
			Object nodeValue = insertLocation.value();
			if (ordering.compare(nodeValue, value) < 0) {
				insertLocation.setRight(newNode);
			} else {
				if (!insertLocation.left().isEmpty()) {
                    //等于的情况 ： 左边树的最右边
                    predecessor(insertLocation).setRight(newNode);
				} else {
					insertLocation.setLeft(newNode);
				}
			}
		}
	}

	protected BinaryTree predecessor(BinaryTree root) {
		assert !root.isEmpty();
		assert !root.left().isEmpty();
		BinaryTree result = root.left();
		while (!result.right().isEmpty()) {
			result = result.right();
		}

		return result;
	}

	// 分情况
	// 1. 要删除的根节点的 左子树【右子树】 为空 直接把右子树【左子树】 赋值给 根
	// 2. 要删除的根节点的 左子树的右子树为空，把根节点的右子树给根节点的左子树的右子树
	// 3. 要删除的根节点的 左子树的右子树不为空，把 左子树的最右边的节点向上提成根节点， 左子树的最右边的节点的左子树向上顶替刚才的左子树的最右边的节点
    protected BinaryTree removeTop(BinaryTree topNode) {
        BinaryTree left = topNode.left();
		BinaryTree right = topNode.right();
		topNode.setLeft(BinaryTree.EMPTY);
		topNode.setRight(BinaryTree.EMPTY);

		// 1
		if (left.isEmpty()) {
			return right;
		}

		// 1
		if (right.isEmpty()) {
			return left;
		}

		// 2
		BinaryTree predecessor = left.right();
		if (predecessor.isEmpty()) {
			left.setRight(right);
			return left;
		}

		// 3
		BinaryTree parent = left;
		while (!predecessor.right().isEmpty()) {
			parent = predecessor;
			predecessor = predecessor.right();
		}

		parent.setRight(predecessor.left());
		predecessor.setRight(right);
		return predecessor;
	}
}
