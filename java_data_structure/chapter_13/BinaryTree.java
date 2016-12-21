/*************************************************************************
	> File Name: BinaryTree.java
	> Author: alick
	> Mail: alick97@outlook.com 
	> Created Time: 2016年12月15日 星期四 22时13分59秒
 ************************************************************************/
// 二叉树

public class BinaryTree {
	protected Object val;
	protected BinaryTree parent;
	protected BinaryTree left, right;

	public static final BinaryTree EMPTY = new BinaryTree();

	// 用private 只是给static 变量 作为内部用的
	private BinaryTree() {
        val = null;
		parent = null;
		left = right = this;
	}

	public BinaryTree(Object value) {
		val = value;
		parent = null;
		left = right = EMPTY;
	}

	public BinaryTree(Object value, BinaryTree left , BinaryTree right) {
		this(value);
		setLeft(left);
		setRight(right);
	}


	protected void setParent(BinaryTree newParent) {
		parent = newParent;
	}

	public BinaryTree left() {
	    return left;
	}

	public BinaryTree right() {
		return right;
	}

	public BinaryTree parent() {
		return parent;
	}

	public Object value() {
		return val;
	}

	public void setValue(Object value) {
		val = value;
	}

	public void setRight(BinaryTree newRight) {
		if (isEmpty()) return;
		if(right.parent() == this) right.setParent(null);
		right = newRight;
		right.setParent(this);
	}

	public void setLeft(BinaryTree newLeft) {
		if (isEmpty()) return;
		if (left.parent() == this) left.setParent(null);
		left = newLeft;
		left.setParent(this);
	}

	boolean isEmpty() {
		return this == EMPTY;
	}

	// 基于特性的方法
	
	public BinaryTree root() {
		if (parent() == null) return this;
		else return parent().root();
	}

	// 边的数目
	public int depth() {
		if (parent() == null) return 0;
		return 1 + parent.depth();
	}

	public int height() {
		if (isEmpty()) return -1;
		return 1 + Math.max(left.height(), right.height());
	}

	// 判断是不是满树
	public boolean isFull() {
		if (isEmpty()) return true;
		if (left().height() != right().height()) return false;
		return left().isFull() && right.isFull();
	}

	// 利用公式的isFull 不过缺陷是2的次方比较大时候 是会溢出的计算结果不准确
	public boolean isFull2() {
		int h = height();
		int s = size();
		return s == (1<<(h+1)) - 1;
	}

	public int size() {
		if (isEmpty()) return 0;
		return left().size() + right().size() + 1;
	}
}
